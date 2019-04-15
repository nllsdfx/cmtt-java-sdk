package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.layout.LayoutGetByHashtagQuery;
import ru.tjournal.api.sdk.query.layout.LayoutGetQuery;

public class Layout extends Action {

    public Layout(ApiClient client) {
        super(client);
    }

    public LayoutGetQuery get() {
        return new LayoutGetQuery(getClient());
    }

    public LayoutGetByHashtagQuery hastagLayout() {
        return new LayoutGetByHashtagQuery(getClient());
    }
}
