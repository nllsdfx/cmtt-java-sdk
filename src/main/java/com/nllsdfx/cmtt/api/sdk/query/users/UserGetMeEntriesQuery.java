package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetMeEntriesQuery extends QueryBuilder<UserGetMeEntriesQuery, List<Entry>> {

    public UserGetMeEntriesQuery(ApiClient client) {
        super(client, "user/me/entries", Utils.buildParametrizedType(List.class, Entry.class));
    }

    public UserGetMeEntriesQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    public UserGetMeEntriesQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected UserGetMeEntriesQuery _this() {
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
