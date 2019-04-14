package ru.tjournal.api.sdk.query.comments;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class CommentEditQuery extends QueryBuilder<CommentEditQuery, String> {
    public CommentEditQuery(ApiClient client) {
        super(client, "comment/edit/{commentId}/{entryId}", String.class);
        setHttpMethod(HttpMethod.POST);
    }

    public CommentEditQuery commentId(String id) {
        return unsafePath("commentId", id);
    }

    public CommentEditQuery entryId(String id) {
        return unsafePath("entryId", id);
    }

    public CommentEditQuery text(String text) {
        return unsafeParam("text", text);
    }

    @Override
    protected CommentEditQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("text");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Arrays.asList("entryId", "commentId");
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }
}
