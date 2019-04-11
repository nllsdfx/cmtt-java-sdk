package ru.tjournal.api.sdk.client;

import com.mashape.unirest.http.Headers;

/**
 * Wrapper for http response of any chosen library or method.
 * Must have status code (e.g. http 200), content of response, and its headers
 */
public class ClientResponse {

    private int statusCode;

    private String content;

    private Headers headers;

    public ClientResponse(int statusCode, String content, Headers headers) {
        this.statusCode = statusCode;
        this.content = content;
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getContent() {
        return content;
    }

    public Headers getHeaders() {
        return headers;
    }
}
