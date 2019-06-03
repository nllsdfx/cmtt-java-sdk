package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.webhook.WebhooksApiAddQuery;
import com.nllsdfx.cmtt.api.sdk.query.webhook.WebhooksApiDeleteQuery;
import com.nllsdfx.cmtt.api.sdk.query.webhook.WebhooksApiGetQuery;

public class Webhook extends Action {

    public Webhook(ApiClient client) {
        super(client);
    }

    public WebhooksApiGetQuery get() {
        return new WebhooksApiGetQuery(getClient());
    }

    public WebhooksApiAddQuery add() {
        return new WebhooksApiAddQuery(getClient());
    }

    public WebhooksApiDeleteQuery delete() {
        return new WebhooksApiDeleteQuery(getClient());
    }
}
