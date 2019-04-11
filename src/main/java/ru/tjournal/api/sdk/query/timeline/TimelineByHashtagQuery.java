package ru.tjournal.api.sdk.query.timeline;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TimelineByHashtagQuery extends QueryBuilder<TimelineByHashtagQuery, List<Entry>> {

    public TimelineByHashtagQuery(TJApiClient client) {
        super(client, "timeline/mainpage", Utils.buildParametrizedType(List.class, Entry.class));
    }

    public TimelineByHashtagQuery hastag(String hashtag) {
        return unsafeParam("hashtag", hashtag);
    }

    public TimelineByHashtagQuery count(int count) {
        return unsafeParam("count", count);
    }

    public TimelineByHashtagQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    @Override
    protected TimelineByHashtagQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("hashtag");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
