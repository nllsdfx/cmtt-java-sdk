package ru.tjournal.api.sdk.client;

import javax.ws.rs.core.UriBuilder;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Builds queries for API requests
 */
public abstract class QueryBuilder<R, T> extends ApiRequest<T> {

    private final Map<String, String> params = new HashMap<>();

    private final Map<String, String> paths = new HashMap<>();

    private final String url;

    /**
     * Creates builder instance to build api requests
     *
     * @param client TJ api client
     * @param method api method name
     * @param type   type of method response
     */
    protected QueryBuilder(TJApiClient client, String method, Type type) {
        super(client.getApiEndpoint() + client.getApiVersion() + method + "/", client.getTransportClient(), client.getGson(), type, client.getErrorRetryAttempts());
        this.url = client.getApiEndpoint() + client.getApiVersion() + method + "/";
    }

    /**
     * Build request parameter map to query
     *
     * @param params parameters
     * @return string query
     */
    private static String mapToGetString(Map<String, Object> params) {

        return params.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + (entry.getValue() != null ? escape((String) entry.getValue()) : ""))
                .collect(Collectors.joining("&"));
    }

    /**
     * Encode request data
     *
     * @param data request data
     * @return encoded data
     */
    private static String escape(String data) {
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Sets parameter and returns this
     *
     * @param key   param name
     * @param value param value
     * @return this
     */
    protected R unsafePath(String key, String value) {
        paths.put(key, value);
        return _this();
    }

    protected R unsafeParam(String key, String value) {
        params.put(key, value);
        return _this();
    }

    protected R unsafeParam(String key, long count) {
        params.put(key, Long.toString(count));
        return _this();
    }


    /**
     * Get reference to this object
     *
     * @return a reference to this {@code QueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected abstract R _this();

    /**
     * Get list of required parameter names
     *
     * @return list of names
     */
    protected abstract Collection<String> essentialKeys();

    /**
     * Get list of required path params names.
     * @return list of names
     */
    protected abstract Collection<String> essentialPathKeys();

    @Override
    public String buildPath() {

        if (!paths.keySet().containsAll(essentialPathKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }

        if (paths.isEmpty()) {
            return url;
        }

        UriBuilder builder = UriBuilder.fromPath(url);
        return builder.buildFromMap(paths).toASCIIString();
    }

    @Override
    public String buildBody() {
        return mapToGetString(build());
    }

    @Override
    public Map<String, Object> build() {

        if (!params.keySet().containsAll(essentialKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }

        return Collections.unmodifiableMap(params);
    }
}
