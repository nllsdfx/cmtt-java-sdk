package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

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
