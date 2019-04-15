package ru.tjournal.api.sdk.query.widgets;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.Rates;

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
