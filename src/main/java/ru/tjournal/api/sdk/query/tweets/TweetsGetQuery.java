package ru.tjournal.api.sdk.query.tweets;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.tweets.Tweet;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TweetsGetQuery extends QueryBuilder<TweetsGetQuery, List<Tweet>> {

    public TweetsGetQuery(ApiClient client) {
        super(client, "tweets/{mode}", Utils.buildParametrizedType(List.class, Tweet.class));
    }

    public TweetsGetQuery mode(String mode) {
        return unsafePath("mode", mode);
    }

    @Override
    protected TweetsGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("mode");
    }
}
