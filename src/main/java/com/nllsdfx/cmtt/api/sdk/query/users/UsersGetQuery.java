package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.users.UserGetResponse;

import java.util.Collection;
import java.util.Collections;

/**
 * Gets user by id.
 */
public class UsersGetQuery extends QueryBuilder<UsersGetQuery, UserGetResponse> {


    public UsersGetQuery(ApiClient client) {
        super(client, "user/{id}", UserGetResponse.class);
    }

    public UsersGetQuery by(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected UsersGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("id");
    }
}
