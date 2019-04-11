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

    private final TransportClient client;
    private final Gson gson;
    private final Type responseClass;
    private final int retryAttempts;

    /**
     * @param client        client to use for api calls
     * @param gson          gson
     * @param responseClass type of response class
     * @param retryAttempts num of error reattempts
     */
    protected ApiRequest(TransportClient client, Gson gson, Type responseClass, int retryAttempts) {
        this.client = client;
        this.gson = gson;
        this.responseClass = responseClass;
        this.retryAttempts = retryAttempts;
    }

    /**
     * Executes call to an api. By default executes by response.
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

            String url = buildPath();

            ClientResponse response = client.get(url, build());

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
     *
     * @return string representation of body
     */
    public abstract String buildBody();

    /**
     * If url has path params, e.g. user/{id}, replaces them with real params
     * and returns built url.
     *
     * @return ready to use url
     */
    public abstract String buildPath();

}
