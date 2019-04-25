package com.nllsdfx.cmtt.api.sdk.client;

public final class TJApiClient extends ApiClient {

    private static final String API_VERSION = "v1.6/";

    private static final String API_ADDRESS = "https://api.tjournal.ru/";


    public TJApiClient(String token) {
        super(token, API_ADDRESS);
    }

    public TJApiClient(TransportClient transportClient, String token) {
        super(transportClient, token, API_ADDRESS);
    }

    @Override
    public String getApiVersion() {
        return API_VERSION;
    }
}
