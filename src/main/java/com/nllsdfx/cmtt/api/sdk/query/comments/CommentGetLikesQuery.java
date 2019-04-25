package com.nllsdfx.cmtt.api.sdk.query.comments;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Liker;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Returns map, where key is id of liker, and values is liker info (name, avatar etc).
 */
public class CommentGetLikesQuery extends QueryBuilder<CommentGetLikesQuery, Map<String, Liker>> {


    public CommentGetLikesQuery(ApiClient client) {
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
