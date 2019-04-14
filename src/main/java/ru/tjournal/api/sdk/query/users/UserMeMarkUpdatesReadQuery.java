package ru.tjournal.api.sdk.query.users;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Notification;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Marks notifications as read.
 */
public class UserMeMarkUpdatesReadQuery extends QueryBuilder<UserMeMarkUpdatesReadQuery, List<Notification>> {

    public UserMeMarkUpdatesReadQuery(TJApiClient client) {
        super(client, "user/me/updates/read", Utils.buildParametrizedType(List.class, Notification.class));
        setHttpMethod(HttpMethod.POST);
    }

    /**
     * Sets ids, can be null.
     * @param ids ids (can be null)
     * @return this
     */
    public UserMeMarkUpdatesReadQuery ids(String... ids) {

        if (ids != null && ids.length != 0) {
            return unsafeParam("ids", String.join(",", ids));
        }

        return _this();
    }

    @Override
    protected UserMeMarkUpdatesReadQuery _this() {
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

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
