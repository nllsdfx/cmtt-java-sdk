package com.nllsdfx.cmtt.api.sdk.query.entry;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EntriesGetPopularQuery extends QueryBuilder<EntriesGetPopularQuery, List<Entry>> {

    public EntriesGetPopularQuery(ApiClient client) {
        super(client, "entry/{id}/popular", Utils.buildParametrizedType(List.class, Entry.class));
    }

    public EntriesGetPopularQuery id(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected EntriesGetPopularQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("id");
    }
}
