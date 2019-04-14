package ru.tjournal.api.sdk.query.users;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserGetCommentsQuery extends QueryBuilder<UserGetCommentsQuery, List<Comment>> {

    public UserGetCommentsQuery(ApiClient client) {
        this(client, "user/{id}/comments");
    }

    protected UserGetCommentsQuery(ApiClient client, String method) {
        super(client, method, Utils.buildParametrizedType(List.class, Comment.class));
    }

    public UserGetCommentsQuery of(String userId) {
        return unsafePath("id", userId);
    }

    public UserGetCommentsQuery offset(int offset) {
        return unsafeParam("offset", offset);
    }

    public UserGetCommentsQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected UserGetCommentsQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("id");
    }
}
