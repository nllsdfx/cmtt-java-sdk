package com.nllsdfx.cmtt.api.sdk.query.subsite;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.SubsiteSubscriptionResult;

import java.util.Collection;
import java.util.Collections;

public class SubsiteUnsubscribeQuery extends QueryBuilder<SubsiteUnsubscribeQuery, SubsiteSubscriptionResult> {

    public SubsiteUnsubscribeQuery(ApiClient client) {
        super(client, "subsite/{id}/unsubscribe", SubsiteSubscriptionResult.class);
    }

    public SubsiteUnsubscribeQuery id(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected SubsiteUnsubscribeQuery _this() {
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
