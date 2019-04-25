package com.nllsdfx.cmtt.api.sdk.query.widgets;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Rates;

import java.util.Collection;
import java.util.Collections;

public class WidgetGetRatesQuery extends QueryBuilder<WidgetGetRatesQuery, Rates> {

    public WidgetGetRatesQuery(ApiClient client) {
        super(client, "rates", Rates.class);
    }

    @Override
    protected WidgetGetRatesQuery _this() {
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
