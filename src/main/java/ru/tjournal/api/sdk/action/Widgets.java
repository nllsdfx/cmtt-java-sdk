package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.widgets.WidgetGetRatesQuery;

public class Widgets extends Action {

    public Widgets(ApiClient client) {
        super(client);
    }

    public WidgetGetRatesQuery rates() {
        return new WidgetGetRatesQuery(getClient());
    }
}
