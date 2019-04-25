package com.nllsdfx.cmtt.api.sdk.query.entry;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class EntryCreateQuery extends QueryBuilder<EntryCreateQuery, Entry> {

    public EntryCreateQuery(ApiClient client) {
        super(client, "entry/create", Entry.class);
        setHttpMethod(HttpMethod.POST);
    }

    public EntryCreateQuery title(String title) {
        return unsafeParam("title", title);
    }

    public EntryCreateQuery text(String text) {
        return unsafeParam("text", text);
    }

    public EntryCreateQuery subsiteId(long id) {
        return unsafeParam("subsite_id", id);
    }

    public EntryCreateQuery attachments(String attachments) {
        return unsafeParam("attachments", attachments);
    }

    @Override
    protected EntryCreateQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("title", "subsite_id", "text");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
