package com.nllsdfx.cmtt.api.sdk.query.blacklist;

import com.mashape.unirest.http.HttpMethod;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.MuteResponse;
import com.nllsdfx.cmtt.api.sdk.model.MuteType;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public abstract class BlacklistMuteQuery extends QueryBuilder<BlacklistMuteQuery, MuteResponse> {

    protected BlacklistMuteQuery(ApiClient client, String method) {
        super(client, method, MuteResponse.class);
        setHttpMethod(HttpMethod.POST);
    }

    public BlacklistMuteQuery id(String id) {
        return unsafeParam("id", id);
    }

    public BlacklistMuteQuery action(MuteType type) {
        return unsafeParam("action", type.name().toLowerCase());
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("action", "id");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

    @Override
    protected BlacklistMuteQuery _this() {
        return this;
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
