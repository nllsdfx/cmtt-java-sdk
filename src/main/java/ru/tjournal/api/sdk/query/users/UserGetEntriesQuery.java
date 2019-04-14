package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetEntriesQuery extends QueryBuilder<UserGetEntriesQuery, List<Entry>> {

    public UserGetEntriesQuery(TJApiClient client) {
        super(client, "user/{id}/entries", Utils.buildParametrizedType(List.class, Entry.class));
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
