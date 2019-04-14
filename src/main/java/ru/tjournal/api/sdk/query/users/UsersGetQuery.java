package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

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
