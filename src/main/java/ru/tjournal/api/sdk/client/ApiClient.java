package ru.tjournal.api.sdk.client;

import com.google.gson.Gson;
import ru.tjournal.api.sdk.action.*;
import ru.tjournal.api.sdk.http.HttpTransportClient;

public abstract class ApiClient {

    private static final int DEFAULT_RETRY_ATTEMPTS = 3;

    private final String apiEndpoint;

    private final TransportClient transportClient;

    private final Gson gson;

    private final int errorRetryAttempts;

    private final String token;

    public ApiClient(String token, String apiEndpoint) {
        this(HttpTransportClient.getInstance(), token, apiEndpoint);
    }

    public ApiClient(TransportClient transportClient, String token, String apiEndpoint) {
        this(apiEndpoint, transportClient, token, new Gson(), DEFAULT_RETRY_ATTEMPTS);
    }

    public ApiClient(String apiEndpoint, TransportClient transportClient, String token, Gson gson, int errorRetryAttempts) {

        this.transportClient = transportClient;
        this.token = token;
        this.gson = gson;
        this.errorRetryAttempts = errorRetryAttempts;
        this.apiEndpoint = apiEndpoint;

        transportClient.addHeader("X-Device-Token", getToken());
    }

    public Users users() {
        return new Users(this);
    }

    public Timeline timeline() {
        return new Timeline(this);
    }

    public Payments payments() {
        return new Payments(this);
    }

    public Entries entries() {
        return new Entries(this);
    }

    public Subsites subsites() {
        return new Subsites(this);
    }

    public Tweets tweets() {
        return new Tweets(this);
    }

    public Comments comments() {
        return new Comments(this);
    }

    public int getErrorRetryAttempts() {
        return errorRetryAttempts;
    }


    public String getApiEndpoint() {
        return apiEndpoint;
    }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public Gson getGson() {
        return gson;
    }

    public String getToken() {
        return token;
    }

    public abstract String getApiVersion();

}
