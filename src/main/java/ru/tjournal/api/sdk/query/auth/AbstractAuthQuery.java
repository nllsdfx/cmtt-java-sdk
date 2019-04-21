package ru.tjournal.api.sdk.query.auth;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

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
