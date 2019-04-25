package com.nllsdfx.cmtt.api.sdk.query.auth;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.users.UserGetResponse;

import java.util.Map;

public abstract class AbstractAuthQuery<R> extends QueryBuilder<R, UserGetResponse> {

    public AbstractAuthQuery(ApiClient client, String method) {
        super(client, method, UserGetResponse.class);
        setHttpMethod(HttpMethod.POST);
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
