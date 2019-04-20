package ru.tjournal.api.sdk.query.comments;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.comment.SeenCommentsResponse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class CommentSaveSeenCountQuery extends QueryBuilder<CommentSaveSeenCountQuery, SeenCommentsResponse> {

    public CommentSaveSeenCountQuery(ApiClient client) {
        super(client, "comment/saveCommentsSeenCount", SeenCommentsResponse.class);
        setHttpMethod(HttpMethod.POST);
    }

    public CommentSaveSeenCountQuery entryId(String id) {
        return unsafeParam("content_id", id);
    }

    public CommentSaveSeenCountQuery count(int count) {
        return unsafeParam("count", count);
    }

    @Override
    protected CommentSaveSeenCountQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("content_id", "count");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> buildParams() {
        return null;
    }

}
