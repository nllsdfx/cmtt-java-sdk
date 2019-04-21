package ru.tjournal.api.sdk.query.blacklist;

import ru.tjournal.api.sdk.client.ApiClient;

public class MuteHashtagQuery extends BlacklistMuteQuery {

    public MuteHashtagQuery(ApiClient client) {
        super(client, "hashtag/mute");
    }

}
