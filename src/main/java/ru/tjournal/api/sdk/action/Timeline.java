package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.timeline.TimelineGetQuery;

public class Timeline extends Action {

    public Timeline(TJApiClient client) {
        super(client);
    }

    public TimelineGetQuery get() {
        return new TimelineGetQuery(getClient());
    }
}
