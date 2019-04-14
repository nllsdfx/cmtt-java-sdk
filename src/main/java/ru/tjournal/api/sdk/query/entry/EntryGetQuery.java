package ru.tjournal.api.sdk.query.entry;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.entry.Entry;

import java.util.Collection;
import java.util.Collections;

public class EntryGetQuery extends QueryBuilder<EntryGetQuery, Entry> {


    public EntryGetQuery(ApiClient client) {
        super(client, "entry/{id}", Entry.class);
    }

    public EntryGetQuery by(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected EntryGetQuery _this() {
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
