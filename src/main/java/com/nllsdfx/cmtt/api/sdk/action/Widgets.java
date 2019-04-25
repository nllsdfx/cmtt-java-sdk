package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.widgets.WidgetGetRatesQuery;

public class Widgets extends Action {

    public Widgets(ApiClient client) {
        super(client);
    }

    public WidgetGetRatesQuery rates() {
        return new WidgetGetRatesQuery(getClient());
    }
}
