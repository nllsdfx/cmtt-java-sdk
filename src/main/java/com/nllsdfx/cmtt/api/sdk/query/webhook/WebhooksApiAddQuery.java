package com.nllsdfx.cmtt.api.sdk.query.webhook;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.model.response.webhook.Watcher;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Подписаться на событие
 */
public class WebhooksApiAddQuery extends QueryBuilder<WebhooksApiAddQuery, Watcher> {

    public WebhooksApiAddQuery(ApiClient client) {
        super(client, "webhooks/add", Watcher.class);
        setHttpMethod(HttpMethod.POST);
    }

    // Ссылка на которую будут отправлены данные по событию
    public WebhooksApiAddQuery url(String url) {
        return unsafeParam("url", url);
    }

    // Название события
    public WebhooksApiAddQuery event(String event) {
        return unsafeParam("event", event);
    }

    @Override
    protected WebhooksApiAddQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("url", "event");
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
