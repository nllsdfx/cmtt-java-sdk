package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

public class UserGetFavoriteEntries extends UserGetEntriesQuery {

    public UserGetFavoriteEntries(ApiClient client) {
        super(client, "user/{id}/favorites/entries");
    }

    @Override
    protected UserGetFavoriteEntries _this() {
        return this;
    }
}
