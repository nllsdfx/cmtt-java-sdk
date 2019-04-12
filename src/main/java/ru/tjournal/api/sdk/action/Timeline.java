package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.timeline.FlashFolderGetQuery;
import ru.tjournal.api.sdk.query.timeline.TimelineByHashtagQuery;
import ru.tjournal.api.sdk.query.timeline.TimelineGetQuery;
import ru.tjournal.api.sdk.query.timeline.TimelineNewsQuery;

public class Timeline extends Action {

    public Timeline(TJApiClient client) {
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
