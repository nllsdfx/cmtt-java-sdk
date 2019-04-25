package com.nllsdfx.cmtt.api.sdk.query.blacklist;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

public class MuteHashtagQuery extends BlacklistMuteQuery {

    public MuteHashtagQuery(ApiClient client) {
        super(client, "hashtag/mute");
    }

}
