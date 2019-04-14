package ru.tjournal.api.sdk.client;

import javax.ws.rs.core.UriBuilder;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Builds queries for API requests
 */
public abstract class QueryBuilder<R, T> extends ApiRequest<T> {

    private final Map<String, String> params = new HashMap<>();

    private final Map<String, String> paths = new HashMap<>();

    private final Map<String, String> body = new HashMap<>();

    private final String url;

    /**
     * Creates builder instance to buildParams api requests
     *
     * @param client TJ api client
     * @param method api method name
     * @param type   type of method response
     */
    protected QueryBuilder(ApiClient client, String method, Type type) {
        super(client.getTransportClient(), client.getGson(), type, client.getErrorRetryAttempts());
        this.url = client.getApiEndpoint() + client.getApiVersion() + method;
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
        body.put(key, value);
        return _this();
    }

    protected R unsafeParam(String key, long value) {
        return unsafeParam(key, Long.toString(value));
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
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialPathKeys());
        }

        if (paths.isEmpty()) {
            return url;
        }

        UriBuilder builder = UriBuilder.fromPath(url);
        return builder.buildFromMap(paths).toASCIIString();
    }

    @Override
    public Map<String, Object> buildBody() {

        if (!body.keySet().containsAll(essentialKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }


        return Collections.unmodifiableMap(body);
    }

    @Override
    public Map<String, Object> buildParams() {

        if (!params.keySet().containsAll(essentialKeys())) {
            throw new IllegalArgumentException("Not all the keys are passed: essential keys are " + essentialKeys());
        }

        return Collections.unmodifiableMap(params);
    }
}
