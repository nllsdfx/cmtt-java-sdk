package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.users.*;

/**
 * Entries point for users api
 */
public class Users extends Action {

    public Users(TJApiClient client) {
        super(client);
    }

    public UsersGetQuery get() {
        return new UsersGetQuery(getClient());
    }

    public UsersGetMeQuery me() {
        return new UsersGetMeQuery(getClient());
    }

    public UserGetMeUpdates meUpdates() {
        return new UserGetMeUpdates(getClient());
    }

    public UserGetMeUpdatesCountQuery meUpdatesCount() {
        return new UserGetMeUpdatesCountQuery(getClient());
    }

    public UserMeMarkUpdatesReadQuery markUpdatesAsRead() {
        return new UserMeMarkUpdatesReadQuery(getClient());
    }

    public UserGetCommentsQuery comments() {
        return new UserGetCommentsQuery(getClient());
    }

    public UserGetMeCommentsQuery meComments() {
        return new UserGetMeCommentsQuery(getClient());
    }
}
