package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.tweets.TweetsGetQuery;

public class Tweets extends Action {

    public Tweets(ApiClient client) {
        super(client);
    }

    public TweetsGetQuery get() {
        return new TweetsGetQuery(getClient());
    }
}
