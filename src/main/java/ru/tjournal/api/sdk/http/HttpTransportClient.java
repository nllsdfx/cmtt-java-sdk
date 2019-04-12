package ru.tjournal.api.sdk.http;

import com.mashape.unirest.http.HttpMethod;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import ru.tjournal.api.sdk.client.ClientResponse;
import ru.tjournal.api.sdk.client.TransportClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Default implementation. Uses Unirest library under the hood.
 * Singleton for now.
 */
public final class HttpTransportClient implements TransportClient {

    private final Map<String, String> headers;

    private HttpTransportClient() {
        headers = new HashMap<>();
    }

    @Override
    public ClientResponse get(String url) throws IOException {
        return doRequest(url, HttpMethod.GET);
    }

    @Override
    public ClientResponse get(String url, Map<String, Object> params) throws IOException {
        return doRequest(HttpMethod.GET, url, params, null);
    }

    @Override
    public ClientResponse post(String url) throws IOException {
        return doRequest(url, HttpMethod.POST);
    }

    @Override
    public ClientResponse post(String url, String body) throws IOException {
        return doRequest(HttpMethod.POST, url, null, body);
    }

    @Override
    public ClientResponse post(String url, String body, Map<String, Object> params) throws IOException {
        return doRequest(HttpMethod.POST, url, params, body);
    }

    @Override
    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    private ClientResponse doRequest(String url, HttpMethod method) throws IOException {
        return doRequest(method, url, null, null);
    }


    private ClientResponse doRequest(HttpMethod method, String url, Map<String, Object> params, String body) throws IOException {

        HttpRequest request;

        switch (method) {
            case POST:
                request = Unirest.post(url);
                break;
            case PUT:
                request = Unirest.post(url);
                break;
            case DELETE:
                request = Unirest.delete(url);
                break;
            default:
                request = Unirest.get(url);
        }


            if (body != null && !body.isEmpty() && request instanceof HttpRequestWithBody) {
                ((HttpRequestWithBody) request).body(params);
            }

            if (params != null && !params.isEmpty()) {
                request.queryString(params);
            }

        try {
            HttpResponse<String> response = request.headers(headers).asString();
            return new ClientResponse(response.getStatus(), response.getBody(), response.getHeaders());

        } catch (UnirestException ex) {
            throw new IOException(ex);
        }

    }

    private static class Holder {
        static final HttpTransportClient CLIENT = new HttpTransportClient();
    }

    public static TransportClient getInstance() {
        return Holder.CLIENT;
    }
}
