package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.layout.LayoutGetByHashtagQuery;
import com.nllsdfx.cmtt.api.sdk.query.layout.LayoutGetQuery;

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
