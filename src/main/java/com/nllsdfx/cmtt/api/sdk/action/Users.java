package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.users.*;

/**
 * Entries point for users api
 */
public class Users extends Action {

    public Users(ApiClient client) {
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

    public UserGetEntriesQuery entries() {
        return new UserGetEntriesQuery(getClient());
    }

    public UserGetMeEntriesQuery meEntries() {
        return new UserGetMeEntriesQuery(getClient());
    }

    public UserGetFavoriteEntries favoriteEntries() {
        return new UserGetFavoriteEntries(getClient());
    }

    public UserGetFavoriteComments favoriteComments() {
        return new UserGetFavoriteComments(getClient());
    }

    public UserGetMeRecommendedSubscriptionsQuery recommendedSubscriptions() {
        return new UserGetMeRecommendedSubscriptionsQuery(getClient());
    }
}
