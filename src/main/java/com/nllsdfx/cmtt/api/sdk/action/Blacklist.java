package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.blacklist.MuteContentQuery;
import com.nllsdfx.cmtt.api.sdk.query.blacklist.MuteHashtagQuery;
import com.nllsdfx.cmtt.api.sdk.query.blacklist.MuteSubsiteQuery;

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
