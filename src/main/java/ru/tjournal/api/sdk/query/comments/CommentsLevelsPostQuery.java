package ru.tjournal.api.sdk.query.comments;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;

import java.util.Collection;
import java.util.LinkedList;

public class CommentsLevelsPostQuery extends CommentLevelsGetQuery {


    public CommentsLevelsPostQuery(ApiClient client) {
        super(client);
        setHttpMethod(HttpMethod.POST);
    }

    public CommentsLevelsPostQuery ids(String... ids) {
        unsafePath("ids", String.join(",", ids));
        return this;
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        LinkedList<String> keys = new LinkedList<>(super.essentialPathKeys());
        keys.add("ids");
        return keys;
    }
}
