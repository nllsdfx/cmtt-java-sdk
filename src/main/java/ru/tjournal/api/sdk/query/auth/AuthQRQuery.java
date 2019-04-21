package ru.tjournal.api.sdk.query.auth;

import ru.tjournal.api.sdk.client.ApiClient;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

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

    @Override
    public Map<String, Object> buildParams() {
        return  null;
    }
}
