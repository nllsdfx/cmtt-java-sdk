package com.nllsdfx.cmtt.api.sdk.query.layout;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.EntryContent;

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
