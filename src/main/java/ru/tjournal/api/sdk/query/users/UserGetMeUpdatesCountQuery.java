package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Count;

import java.util.Collection;
import java.util.Collections;

/**
 * Gets unread notifications count from "me" user.
 */
public class UserGetMeUpdatesCountQuery extends QueryBuilder<UserGetMeUpdatesCountQuery, Count> {

    public UserGetMeUpdatesCountQuery(TJApiClient client) {
        super(client, "user/me/updates/count", Count.class);
    }

    @Override
    protected UserGetMeUpdatesCountQuery _this() {
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
