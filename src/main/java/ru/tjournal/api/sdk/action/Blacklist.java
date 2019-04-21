package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.blacklist.MuteContentQuery;
import ru.tjournal.api.sdk.query.blacklist.MuteHashtagQuery;
import ru.tjournal.api.sdk.query.blacklist.MuteSubsiteQuery;

public class Blacklist extends Action {

    public Blacklist(ApiClient client) {
        super(client);
    }

    public MuteContentQuery muteContent() {
        return new MuteContentQuery(getClient());
    }

    public MuteHashtagQuery muteHastag() {
        return new MuteHashtagQuery(getClient());
    }

    public MuteSubsiteQuery muteSubsite() {
        return new MuteSubsiteQuery(getClient());
    }
}
