package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Notification;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetMeUpdates extends QueryBuilder<UserGetMeUpdates, List<Notification>> {

    public UserGetMeUpdates(ApiClient client) {
        super(client, "user/me/updates", Utils.buildParametrizedType(List.class, Notification.class));
    }

    public UserGetMeUpdates isRead(int isRead) {
        return unsafeParam("is_read", isRead);
    }

    public UserGetMeUpdates lastId(long lastId) {
        return unsafeParam("last_id", lastId);
    }

    @Override
    protected UserGetMeUpdates _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
