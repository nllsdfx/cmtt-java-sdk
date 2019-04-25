package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

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
