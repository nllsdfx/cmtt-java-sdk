package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetMeCommentsQuery extends QueryBuilder<UserGetMeCommentsQuery, List<Comment>> {

    public UserGetMeCommentsQuery(ApiClient client) {
        super(client, "user/me/comments", Utils.buildParametrizedType(List.class, Comment.class));
    }

    public UserGetMeCommentsQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    public UserGetMeCommentsQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected UserGetMeCommentsQuery _this() {
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
