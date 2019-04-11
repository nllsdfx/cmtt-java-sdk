package ru.tjournal.api.sdk.query.timeline;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TimelineGetQuery extends QueryBuilder<TimelineGetQuery, List<Entry>> {

    public TimelineGetQuery(TJApiClient client) {
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
