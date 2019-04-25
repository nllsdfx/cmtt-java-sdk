package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetEntriesQuery extends QueryBuilder<UserGetEntriesQuery, List<Entry>> {

    public UserGetEntriesQuery(ApiClient client) {
        this(client, "user/{id}/entries");
    }

    protected UserGetEntriesQuery(ApiClient client, String method) {
        super(client, method, Utils.buildParametrizedType(List.class, Entry.class));
    }

    public UserGetEntriesQuery of(String userId) {
        return unsafePath("id", userId);
    }

    public UserGetEntriesQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    public UserGetEntriesQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected UserGetEntriesQuery _this() {
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
