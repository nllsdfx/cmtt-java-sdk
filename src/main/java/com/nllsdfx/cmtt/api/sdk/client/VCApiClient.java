package com.nllsdfx.cmtt.api.sdk.client;

import com.nllsdfx.cmtt.api.sdk.action.Vacancies;

public final class VCApiClient extends ApiClient {

    private static final String API_ADDRESS = "https://api.dtf.ru/";

    private static final String API_VERSION = "v1.6/";


    public VCApiClient(String token) {
        super(token, API_ADDRESS);
    }

    public VCApiClient(TransportClient transportClient, String token) {
        super(transportClient, token, API_ADDRESS);
    }

    public Vacancies vacancies() {
        return new Vacancies(this);
    }


    @Override
    public String getApiVersion() {
        return API_VERSION;
    }
}
