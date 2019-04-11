package ru.tjournal.api.sdk.query.comments;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommentGetQuery extends QueryBuilder<CommentGetQuery, List<Comment>> {

    public CommentGetQuery(TJApiClient client, String entryId) {
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
