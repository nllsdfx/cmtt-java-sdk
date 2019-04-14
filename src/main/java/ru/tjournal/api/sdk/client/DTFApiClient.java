package ru.tjournal.api.sdk.client;

public final class DTFApiClient extends ApiClient {

    private static final String API_ADDRESS = "";

    private static final String API_VERSION = "v1.6/";


    public DTFApiClient(String token) {
        super(token, API_ADDRESS);
    }

    public DTFApiClient(TransportClient transportClient, String token) {
        super(transportClient, token, API_ADDRESS);
    }

    @Override
    public String getApiVersion() {
        return API_VERSION;
    }
}
