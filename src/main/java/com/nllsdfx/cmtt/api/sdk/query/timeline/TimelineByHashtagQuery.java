package com.nllsdfx.cmtt.api.sdk.query.timeline;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TimelineByHashtagQuery extends QueryBuilder<TimelineByHashtagQuery, List<Entry>> {

    public TimelineByHashtagQuery(ApiClient client) {
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
