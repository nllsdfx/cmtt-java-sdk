package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.tweets.TweetsGetQuery;

public class Tweets extends Action {

    public Tweets(TJApiClient client) {
        super(client);
    }

    public TweetsGetQuery get() {
        return new TweetsGetQuery(getClient());
    }
}
