package com.nllsdfx.cmtt.api.sdk.query.timeline;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TimelineGetQuery extends QueryBuilder<TimelineGetQuery, List<Entry>> {

    public TimelineGetQuery(ApiClient client) {
        super(client, "timeline/{category}/{sorting}", Utils.buildParametrizedType(List.class, Entry.class));
    }


    public TimelineGetQuery category(String category) {
        return unsafePath("category", category);
    }


    public TimelineGetQuery sorting(String sorting) {
        return unsafePath("sorting", "sorting");
    }

    public TimelineGetQuery count(long count) {
        return unsafeParam("count", count);
    }

    public TimelineGetQuery offset(long offset) {
        return unsafeParam("offset", offset);
    }

    @Override
    protected TimelineGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Arrays.asList("category", "sorting");
    }
}
