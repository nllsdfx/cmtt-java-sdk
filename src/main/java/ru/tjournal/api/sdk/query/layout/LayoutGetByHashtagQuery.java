package ru.tjournal.api.sdk.query.layout;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.entry.EntryContent;

import java.util.Collection;
import java.util.Collections;

public class LayoutGetByHashtagQuery extends QueryBuilder<LayoutGetByHashtagQuery, EntryContent> {

    public LayoutGetByHashtagQuery(ApiClient client) {
        super(client, "layout/hashtag/{hashtag}", EntryContent.class);
    }

    public LayoutGetByHashtagQuery hashtag(String hashtag) {
        return unsafePath("hashtag", hashtag);
    }

    @Override
    protected LayoutGetByHashtagQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("hashtag");
    }
}
