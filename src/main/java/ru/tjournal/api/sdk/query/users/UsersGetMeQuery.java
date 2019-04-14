package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

import java.util.Collection;
import java.util.Collections;

public class UsersGetMeQuery extends QueryBuilder<UsersGetMeQuery, UserGetResponse> {

    public UsersGetMeQuery(ApiClient client) {
        super(client, "user/me", UserGetResponse.class);
    }

    @Override
    protected UsersGetMeQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
