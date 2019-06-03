package com.nllsdfx.cmtt.api.sdk.query.webhook;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.webhook.Watcher;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WebhooksApiGetQuery extends QueryBuilder<WebhooksApiGetQuery, List<Watcher>> {

    public WebhooksApiGetQuery(ApiClient client) {
        super(client, "webhooks/get", Utils.buildParametrizedType(List.class, Watcher.class));
    }

    @Override
    protected WebhooksApiGetQuery _this() {
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
