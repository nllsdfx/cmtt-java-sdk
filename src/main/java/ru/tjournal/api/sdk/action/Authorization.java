package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.auth.AuthLoginQuery;
import ru.tjournal.api.sdk.query.auth.AuthQRQuery;

public class Authorization extends Action {

    public Authorization(ApiClient client) {
        super(client);
    }

    public AuthQRQuery qr() {
        return new AuthQRQuery(getClient());
    }

    public AuthLoginQuery login() {
        return new AuthLoginQuery(getClient());
    }
}
