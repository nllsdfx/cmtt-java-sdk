package com.nllsdfx.cmtt.api.sdk.query.timeline;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FlashFolderGetQuery extends QueryBuilder<FlashFolderGetQuery, List<Entry>> {

    public FlashFolderGetQuery(ApiClient client) {
        super(client, "getflashholdedentry", Utils.buildParametrizedType(List.class, Entry.class));
    }

    @Override
    protected FlashFolderGetQuery _this() {
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
