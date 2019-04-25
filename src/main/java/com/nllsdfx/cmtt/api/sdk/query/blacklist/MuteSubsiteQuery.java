package com.nllsdfx.cmtt.api.sdk.query.blacklist;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

public class MuteSubsiteQuery extends BlacklistMuteQuery {

    public MuteSubsiteQuery(ApiClient client) {
        super(client, "subsite/mute");
    }
}
