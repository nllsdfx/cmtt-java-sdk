package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.comments.CommentGetQuery;

public class Comments extends Action {

    public Comments(TJApiClient client) {
        super(client);
    }

    public CommentGetQuery getBy(String entryId) {
        return new CommentGetQuery(getClient(), entryId);
    }

}
