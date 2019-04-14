package ru.tjournal.api.sdk.client;

import com.google.gson.Gson;
import ru.tjournal.api.sdk.action.*;
import ru.tjournal.api.sdk.http.HttpTransportClient;

public class TJApiClient {

    private static final String API_VERSION = "v1.6/";

    private static final String API_ADDRESS = "https://api.tjournal.ru/";

    private static final int DEFAULT_RETRY_ATTEMPTS = 3;

    private final String apiEnpoint;

    private final TransportClient transportClient;

    private final Gson gson;

    private final int errorRetryAttempts;

    private final String token;

    public TJApiClient(String token) {
        this(HttpTransportClient.getInstance(), token);
    }

    public TJApiClient(TransportClient transportClient, String token) {
        this(transportClient, token, new Gson(), DEFAULT_RETRY_ATTEMPTS);
    }

    public TJApiClient(TransportClient transportClient, String token, Gson gson, int errorRetryAttempts) {

        this.transportClient = transportClient;
        this.token = token;
        this.gson = gson;
        this.errorRetryAttempts = errorRetryAttempts;

        String tjApiEndpoint = System.getenv("TJ_API_ENDPOINT");

        if (tjApiEndpoint == null || tjApiEndpoint.trim().isEmpty()) {
            this.apiEnpoint = API_ADDRESS;
        } else {
            this.apiEnpoint = tjApiEndpoint;
        }

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

    public Vacancies vacancies() {
        return new Vacancies(this);
    }

    public Gson getGson() {
        return gson;
    }

    public TransportClient getTransportClient() {
        return transportClient;
    }

    public int getErrorRetryAttempts() {
        return errorRetryAttempts;
    }

    public String getToken() {
        return token;
    }

    public String getApiEndpoint() {
        return apiEnpoint;
    }

    public String getApiVersion() {
        return API_VERSION;
    }
}
