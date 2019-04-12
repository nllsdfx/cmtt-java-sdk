package ru.tjournal.api.sdk.query.entry;

import com.mashape.unirest.http.HttpMethod;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.Likes;
import ru.tjournal.api.sdk.model.Sign;

import java.util.Collection;
import java.util.Collections;

/**
 * Query to like an entry (article).
 */
public class EntryLikeQuery extends QueryBuilder<EntryLikeQuery, Likes> {

    public EntryLikeQuery(TJApiClient client) {
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
    public String buildBody() {
        return null; // this post method doesn't need body, need to improve api later
    }
}
