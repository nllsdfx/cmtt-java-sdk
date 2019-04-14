package ru.tjournal.api.sdk.query.timeline;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TimelineNewsQuery extends QueryBuilder<TimelineNewsQuery, List<Entry>> {

    public TimelineNewsQuery(ApiClient client) {
        super(client, "news/default/recent", Utils.buildParametrizedType(List.class, Entry.class));
    }

    public TimelineNewsQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    public TimelineNewsQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected TimelineNewsQuery _this() {
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
