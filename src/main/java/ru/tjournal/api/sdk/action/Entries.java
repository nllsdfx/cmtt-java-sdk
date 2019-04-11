package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.comments.EntryGetQuery;

public class Entries extends Action {

    public Entries(TJApiClient client) {
        super(client);
    }

    public EntryGetQuery get() {
        return new EntryGetQuery(getClient());
    }
}
