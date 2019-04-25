package com.nllsdfx.cmtt.api.sdk.query.auth;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

import java.util.Collection;
import java.util.Collections;

public class AuthQRQuery extends AbstractAuthQuery<AuthQRQuery> {

    public AuthQRQuery(ApiClient client) {
        super(client, "auth/qr");
    }

    public AuthQRQuery token(String token) {
        return unsafeParam("token", token);
    }

    @Override
    protected AuthQRQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("token");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
