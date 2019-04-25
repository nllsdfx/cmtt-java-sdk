package com.nllsdfx.cmtt.api.sdk.query.blacklist;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

public class MuteContentQuery extends BlacklistMuteQuery {

    public MuteContentQuery(ApiClient client) {
        super(client, "content/mute");
    }

}
