package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.users.UserGetResponse;

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
