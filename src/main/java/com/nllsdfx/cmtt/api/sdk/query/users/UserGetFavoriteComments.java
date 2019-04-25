package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

public class UserGetFavoriteComments extends UserGetCommentsQuery {

    public UserGetFavoriteComments(ApiClient client) {
        super(client, "user/{id}/favorites/comments");
    }

    @Override
    protected UserGetCommentsQuery _this() {
        return this;
    }
}
