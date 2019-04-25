package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Count;

import java.util.Collection;
import java.util.Collections;

/**
 * Gets unread notifications count from "me" user.
 */
public class UserGetMeUpdatesCountQuery extends QueryBuilder<UserGetMeUpdatesCountQuery, Count> {

    public UserGetMeUpdatesCountQuery(ApiClient client) {
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
