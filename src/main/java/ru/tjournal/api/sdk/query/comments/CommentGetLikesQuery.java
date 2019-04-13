package ru.tjournal.api.sdk.query.comments;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Liker;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Returns map, where key is id of liker, and values is liker info (name, avatar etc).
 */
public class CommentGetLikesQuery extends QueryBuilder<CommentGetLikesQuery, Map<String, Liker>> {


    public CommentGetLikesQuery(TJApiClient client) {
        super(client, "comment/likers/{id}", Utils.buildParametrizedType(Map.class, String.class, Liker.class));
    }

    public CommentGetLikesQuery of(String id) {
        return unsafePath("id", id);
    }

    @Override
    protected CommentGetLikesQuery _this() {
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
