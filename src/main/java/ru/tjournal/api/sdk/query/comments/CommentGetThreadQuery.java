package ru.tjournal.api.sdk.query.comments;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.comment.CommentItems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Get comments for an entry by threads restriction
 */
public class CommentGetThreadQuery extends QueryBuilder<CommentGetThreadQuery, CommentItems> {

    public CommentGetThreadQuery(ApiClient client) {
        super(client, "entry/{entryId}/comments/thread/{commentId}", CommentItems.class);
    }

    public CommentGetThreadQuery entry(String id) {
        return unsafePath("entryId", id);
    }

    public CommentGetThreadQuery comment(String id) {
        return unsafePath("commentId", id);
    }

    @Override
    protected CommentGetThreadQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Arrays.asList("commentId", "entryId");
    }
}
