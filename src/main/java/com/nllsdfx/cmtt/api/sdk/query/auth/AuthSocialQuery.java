package com.nllsdfx.cmtt.api.sdk.query.auth;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.model.response.AuthSocialType;

import java.util.Collection;
import java.util.Collections;

public class AuthSocialQuery extends AbstractAuthQuery<AuthSocialQuery> {

    public AuthSocialQuery(ApiClient client) {
        super(client, "auth/social/{type}");
    }

    public AuthSocialQuery type(AuthSocialType type) {
        return unsafePath("type", type.name().toLowerCase());
    }

    public AuthSocialQuery token(String token) {
        return unsafeParam("token", token);
    }

    public AuthSocialQuery email(String email) {
        return unsafeParam("email", email);
    }

    public AuthSocialQuery linking(boolean needsLinking) {
        int linking = needsLinking ? 1 : 0;
        return unsafeParam("linking", linking);
    }

    @Override
    protected AuthSocialQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("type");
    }
}
