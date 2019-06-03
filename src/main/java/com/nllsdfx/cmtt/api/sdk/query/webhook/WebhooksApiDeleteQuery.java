package com.nllsdfx.cmtt.api.sdk.query.webhook;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.webhook.WebhookDelResponse;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Удаление подписки на событие
 */
public class WebhooksApiDeleteQuery extends QueryBuilder<WebhooksApiDeleteQuery, WebhookDelResponse> {

    public WebhooksApiDeleteQuery(ApiClient client) {
        super(client, "webhooks/del", WebhookDelResponse.class);
        setHttpMethod(HttpMethod.POST);
    }

    public WebhooksApiDeleteQuery event(String event) {
        return unsafeParam("event", event);
    }

    @Override
    protected WebhooksApiDeleteQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singleton("event");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
