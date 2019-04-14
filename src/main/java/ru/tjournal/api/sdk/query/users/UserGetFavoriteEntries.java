package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.TJApiClient;

public class UserGetFavoriteEntries extends UserGetEntriesQuery {

    public UserGetFavoriteEntries(ApiClient client) {
        super(client, "user/{id}/favorites/entries");
    }

    @Override
    protected UserGetFavoriteEntries _this() {
        return this;
    }
}
