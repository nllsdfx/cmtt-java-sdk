package ru.tjournal.api.sdk.client;

import java.io.IOException;
import java.util.Map;

/**
 * Override it if you want to use your own
 * implementation for these methods.
 */
public interface TransportClient {

    ClientResponse get(String url) throws IOException;

    ClientResponse get(String url, Map<String, Object> params) throws IOException;

    ClientResponse post(String url) throws IOException;

    ClientResponse post(String url, Map<String, Object> body) throws IOException;

    ClientResponse post(String url, Map<String, Object> body, Map<String, Object> params) throws IOException;

    void addHeader(String key, String value);

}
