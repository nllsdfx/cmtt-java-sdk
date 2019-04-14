package ru.tjournal.api.sdk.query.comments;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.comment.Comment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class CommentSendQuery extends QueryBuilder<CommentSendQuery, Comment> {

    public CommentSendQuery(ApiClient client) {
        super(client, "comment/add", Comment.class);
        setHttpMethod(HttpMethod.POST);
        replyTo("0"); // by default we don't reply to anyone
    }

    public CommentSendQuery entryId(String id) {
        return unsafeParam("id", id);
    }

    public CommentSendQuery text(String text) {
        return unsafeParam("text", text);
    }

    public CommentSendQuery replyTo(String id) {
        return unsafeParam("reply_to", id);
    }

    // todo create attachments dto and convert it to json array
    public CommentSendQuery attachments(String attachments) {
        return unsafeParam("attachments", attachments);
    }

    @Override
    protected CommentSendQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("reply_to", "text", "id");
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
