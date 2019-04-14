package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Count;

import java.util.Collection;
import java.util.Collections;

/**
 * Gets unread notifications count from "me" user.
 */
public class UserGetMeUpdatesCount extends QueryBuilder<UserGetMeUpdatesCount, Count> {

    public UserGetMeUpdatesCount(TJApiClient client) {
        super(client, "user/me/updates/count", Count.class);
    }

    @Override
    protected UserGetMeUpdatesCount _this() {
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
