package com.nllsdfx.cmtt.api.sdk.query.auth;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AuthLoginQuery extends AbstractAuthQuery<AuthLoginQuery> {

    public AuthLoginQuery(ApiClient client) {
        super(client, "auth/login");
    }

    public AuthLoginQuery username(String username) {
        return unsafeParam("login", username);
    }

    public AuthLoginQuery password(String password) {
        return unsafeParam("password", password);
    }

    @Override
    protected AuthLoginQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("login", "password");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

}
