package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.timeline.FlashFolderGetQuery;
import com.nllsdfx.cmtt.api.sdk.query.timeline.TimelineByHashtagQuery;
import com.nllsdfx.cmtt.api.sdk.query.timeline.TimelineGetQuery;
import com.nllsdfx.cmtt.api.sdk.query.timeline.TimelineNewsQuery;

public class Timeline extends Action {

    public Timeline(ApiClient client) {
        super(client);
    }

    public TimelineGetQuery get() {
        return new TimelineGetQuery(getClient());
    }

    public TimelineByHashtagQuery getByHashtag() {
        return new TimelineByHashtagQuery(getClient());
    }

    public TimelineNewsQuery timeLineNews() {
        return new TimelineNewsQuery(getClient());
    }

    public FlashFolderGetQuery getFlashHolder() {
        return new FlashFolderGetQuery(getClient());
    }
}
