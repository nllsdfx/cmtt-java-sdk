package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.TJApiClient;

public class UserGetFavoriteComments extends UserGetCommentsQuery {

    public UserGetFavoriteComments(TJApiClient client) {
        super(client, "user/{id}/favorites/comments");
    }

    @Override
    protected UserGetCommentsQuery _this() {
        return this;
    }
}
