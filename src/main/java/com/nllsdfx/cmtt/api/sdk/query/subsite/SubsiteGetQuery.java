package com.nllsdfx.cmtt.api.sdk.query.subsite;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Subsite;

import java.util.Collection;
import java.util.Collections;

public class SubsiteGetQuery extends QueryBuilder<SubsiteGetQuery, Subsite> {


    public SubsiteGetQuery(ApiClient client) {
        super(client, "subsite/{id}", Subsite.class);
    }

    public SubsiteGetQuery id(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected SubsiteGetQuery _this() {
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
