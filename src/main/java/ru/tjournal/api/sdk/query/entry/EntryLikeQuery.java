package ru.tjournal.api.sdk.query.entry;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.Likes;
import ru.tjournal.api.sdk.model.Sign;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Query to like an entry (article).
 */
// todo not working for v1.6 (api is not properly described)
public class EntryLikeQuery extends QueryBuilder<EntryLikeQuery, Likes> {

    public EntryLikeQuery(ApiClient client) {
        super(client, "entry/{id}/likes", Likes.class);
        setHttpMethod(HttpMethod.POST);
    }

    public EntryLikeQuery entry(String entryId) {
        return unsafePath("id", entryId);
    }

    public EntryLikeQuery sign(Sign sign) {
        return unsafeParam("sign", sign.getSign());
    }

    @Override
    protected EntryLikeQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.singletonList("sign");
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("id");
    }

    @Override
    public Map<String, Object> buildBody() {
        return null; // this post method doesn't need body, need to improve api later
    }
}
