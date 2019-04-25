package com.nllsdfx.cmtt.api.sdk.query.entry;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;

import java.util.Collection;
import java.util.Collections;

public class EntryLocateQuery extends QueryBuilder<EntryLocateQuery, Entry> {


    public EntryLocateQuery(ApiClient client) {
        super(client, "entry/locate", Entry.class);
    }

    public EntryLocateQuery url(String url) {
        return unsafeParam("url", url);
    }

    @Override
    protected EntryLocateQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("url");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
