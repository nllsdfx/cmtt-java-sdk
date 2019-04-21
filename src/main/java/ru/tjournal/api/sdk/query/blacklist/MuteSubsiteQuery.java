package ru.tjournal.api.sdk.query.blacklist;

import ru.tjournal.api.sdk.client.ApiClient;

public class MuteSubsiteQuery extends BlacklistMuteQuery {

    public MuteSubsiteQuery(ApiClient client) {
        super(client, "subsite/mute");
    }
}
