package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.users.UsersGetQuery;

/**
 * Entry point for users api
 */
public class Users extends Action {

    public Users(TJApiClient client) {
        super(client);
    }

    public UsersGetQuery get() {
        return new UsersGetQuery(getClient());
    }
}
