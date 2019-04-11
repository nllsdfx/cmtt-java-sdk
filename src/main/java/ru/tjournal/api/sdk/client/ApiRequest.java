package ru.tjournal.api.sdk.client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.apache.http.HttpStatus;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.ApiError;
import ru.tjournal.api.sdk.util.StringUtils;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Template to execute api calls.
 *
 * @param <T> type of response
 */
public abstract class ApiRequest<T> {

    private final String url;
    private final TransportClient client;
    private final Gson gson;
    private final Type responseClass;
    private final int retryAttempts;
    private final boolean isPathParams;

    /**
     *
     * @param url full url without query string
     * @param client client to use for api calls
     * @param gson gson
     * @param responseClass type of response class
     * @param retryAttempts num of error reattempts
     * @param isPathParams is path params, e.g. user/{id}, otherwise query params, e.g. /?id=ID
     */
    protected ApiRequest(String url, TransportClient client, Gson gson, Type responseClass, int retryAttempts, boolean isPathParams) {
        this.url = url;
        this.client = client;
        this.gson = gson;
        this.responseClass = responseClass;
        this.retryAttempts = retryAttempts;
        this.isPathParams = isPathParams;
    }

    /**
     * Executes call to an api. By default executes get response.
     *
     * @return pojo represents received response.
     * @throws ClientException if any errors occurred
     */
    public T execute() throws ClientException, ApiException {


        ApiException exception = null;

        for (int i = 0; i < retryAttempts; i++) {
            try {
                return call();
            } catch (ApiException ex) {
                exception = ex;
            }
        }


        throw exception;
    }

    private T call() throws ClientException, ApiException {

        String textResponse = executeAsString();

        JsonReader jsonReader = new JsonReader(new StringReader(textResponse));

        JsonObject json = (JsonObject) new JsonParser().parse(jsonReader);

        if (json.has("result")) {
            return gson.fromJson(json.get("result"), responseClass);
        }

        if (json.has("error")) {
            ApiError error = gson.fromJson(json.get("error"), ApiError.class);
            throw new ApiException(String.format("Can't execute api call, error code: %d", error.getCode()));
        } else {
            throw new ApiException("Can't execute api call");
        }

    }

    private String executeAsString() throws ClientException {

        try {

            Map<String, Object> params = build();


            ClientResponse response;


            if (isPathParams) {
                UriBuilder builder = UriBuilder.fromPath(url);
                response = client.get(builder.buildFromMap(params).toASCIIString());
            } else {
                response = client.get(url, params);
            }

            if (HttpStatus.SC_OK != response.getStatusCode()) {
                throw new ClientException(String.format("Internal API server error. Response code: %d. Message: %s", response.getStatusCode(), response.getContent()));
            }

            String contentType = response.getHeaders().getFirst("Content-Type");

            if (StringUtils.isBlank(contentType)) {
                throw new ClientException("Content-Type is null or empty!");
            }

            if (!contentType.contains("application/json") && !contentType.contains("text/javascript")) {
                throw new ClientException("Invalid content type");
            }

            return response.getContent();

        } catch (IOException e) {
            throw new ClientException(e.getMessage(), e);
        }

    }

    /**
     * Builds params for the request.
     *
     * @return string representation of params
     */
    public abstract Map<String, Object> build();

    /**
     * Builds body for the request.
     * @return string representation of body
     */
    public abstract String buildBody();

}
