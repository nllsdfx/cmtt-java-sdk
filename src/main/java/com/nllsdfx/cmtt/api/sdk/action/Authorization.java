package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.auth.AuthLoginQuery;
import com.nllsdfx.cmtt.api.sdk.query.auth.AuthQRQuery;
import com.nllsdfx.cmtt.api.sdk.query.auth.AuthSocialQuery;

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

    public AuthSocialQuery social() {
        return new AuthSocialQuery(getClient());
    }
}
