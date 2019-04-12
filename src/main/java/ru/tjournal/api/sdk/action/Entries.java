package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.comments.CommentGetQuery;
import ru.tjournal.api.sdk.query.entry.EntriesGetPopularQuery;
import ru.tjournal.api.sdk.query.entry.EntryGetQuery;

public class Entries extends Action {

    public Entries(TJApiClient client) {
        super(client);
    }

    public EntryGetQuery get() {
        return new EntryGetQuery(getClient());
    }

    public EntriesGetPopularQuery popular() {
        return new EntriesGetPopularQuery(getClient());
    }

    public CommentGetQuery comments(String entryId) {
        return new CommentGetQuery(getClient(), entryId);
    }
}
