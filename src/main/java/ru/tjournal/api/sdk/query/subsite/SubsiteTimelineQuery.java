package ru.tjournal.api.sdk.query.subsite;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *  https://cmtt-ru.github.io/osnova-api/redoc.html#operation/getSubsiteTimeline
 */
public class SubsiteTimelineQuery extends QueryBuilder<SubsiteTimelineQuery, List<Entry>> {

    public SubsiteTimelineQuery(ApiClient client) {
        super(client, "subsite/{id}/timeline/{sorting}", Utils.buildParametrizedType(List.class, Entry.class));
    }

    public SubsiteTimelineQuery id(String subsiteId) {
        return unsafePath("id", subsiteId);
    }

    public SubsiteTimelineQuery sorting(String sorting) {
        return unsafePath("sorting", sorting);
    }

    public SubsiteTimelineQuery count(int count) {
        return unsafeParam("count", count);
    }

    public SubsiteTimelineQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    @Override
    protected SubsiteTimelineQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Arrays.asList("sorting", "id");
    }
}
