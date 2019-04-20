package ru.tjournal.api.sdk.query.comments;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.comment.CommentItems;
import ru.tjournal.api.sdk.model.response.comment.CommentsSorting;

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
