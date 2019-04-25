package com.nllsdfx.cmtt.api.sdk.query.comments;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommentGetQuery extends QueryBuilder<CommentGetQuery, List<Comment>> {

    public CommentGetQuery(ApiClient client, String entryId) {
        super(client, "entry/{id}/comments/{sorting}", Utils.buildParametrizedType(List.class, Comment.class));
        entryId(entryId);
    }

    private CommentGetQuery entryId(String id) {
        return unsafePath("id", id);
    }

    public CommentGetQuery sorting(String sorting) {
        return unsafePath("sorting", sorting);
    }

    @Override
    protected CommentGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Arrays.asList("id", "sorting");
    }
}
