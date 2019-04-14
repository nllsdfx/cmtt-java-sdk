package ru.tjournal.api.sdk.query.entry;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.LikeType;
import ru.tjournal.api.sdk.model.Likes;
import ru.tjournal.api.sdk.model.Sign;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Query to like an id (article).
 */
public class EntryLikeQuery extends QueryBuilder<EntryLikeQuery, Likes> {

    public EntryLikeQuery(ApiClient client) {
        super(client, "like", Likes.class);
        setHttpMethod(HttpMethod.POST);
    }

    public EntryLikeQuery id(String entryId) {
        return unsafeParam("id", entryId);
    }

    public EntryLikeQuery sign(Sign sign) {
        return unsafeParam("sign", sign.getSign());
    }

    public EntryLikeQuery type(LikeType type) {

        String _type = type == LikeType.CONTENT ? "content" : "comment";

        return unsafeParam("type", _type);

    }

    @Override
    protected EntryLikeQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Arrays.asList("sign", "type", "id");
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
