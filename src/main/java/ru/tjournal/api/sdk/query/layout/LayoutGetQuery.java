package ru.tjournal.api.sdk.query.layout;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.entry.EntryContent;

import java.util.Collection;
import java.util.Collections;

public class LayoutGetQuery extends QueryBuilder<LayoutGetQuery, EntryContent> {

    public LayoutGetQuery(ApiClient client) {
        super(client, "layout/{version}", EntryContent.class);
    }

    public LayoutGetQuery version(String version) {
        return unsafePath("version", version);
    }

    @Override
    protected LayoutGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("version");
    }
}
