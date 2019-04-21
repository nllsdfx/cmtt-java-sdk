package ru.tjournal.api.sdk.query.subsite;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.SubsiteSubscriptionResult;

import java.util.Collection;
import java.util.Collections;

public class SubsiteSubscribeQuery extends QueryBuilder<SubsiteSubscribeQuery, SubsiteSubscriptionResult> {

    public SubsiteSubscribeQuery(ApiClient client) {
        super(client, "subsite/{id}/subscribe", SubsiteSubscriptionResult.class);
    }

    public SubsiteSubscribeQuery id(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected SubsiteSubscribeQuery _this() {
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
