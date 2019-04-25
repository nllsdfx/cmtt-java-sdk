package com.nllsdfx.cmtt.api.sdk.query.comments;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentItems;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentsSorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Throws 404 error if not levels of comments found.
 */
public class CommentLevelsGetQuery extends QueryBuilder<CommentLevelsGetQuery, CommentItems> {

    public CommentLevelsGetQuery(ApiClient client) {
        super(client, "entry/{id}/comments/levels/{sorting}", CommentItems.class);
    }

    public CommentLevelsGetQuery entryId(String id) {
        return unsafePath("id", id);
    }

    public CommentLevelsGetQuery sorting(CommentsSorting sorting) {
        return unsafePath("sorting", sorting.name().toLowerCase());
    }

    @Override
    protected CommentLevelsGetQuery _this() {
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
