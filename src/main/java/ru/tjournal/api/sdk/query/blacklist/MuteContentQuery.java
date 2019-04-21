package ru.tjournal.api.sdk.query.blacklist;

import ru.tjournal.api.sdk.client.ApiClient;

public class MuteContentQuery extends BlacklistMuteQuery {

    public MuteContentQuery(ApiClient client) {
        super(client, "content/mute");
    }

}
