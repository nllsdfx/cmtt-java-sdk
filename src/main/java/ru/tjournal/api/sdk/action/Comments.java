package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.comments.CommentEditQuery;
import ru.tjournal.api.sdk.query.comments.CommentGetLikesQuery;
import ru.tjournal.api.sdk.query.comments.CommentGetQuery;
import ru.tjournal.api.sdk.query.comments.CommentSendQuery;

public class Comments extends Action {

    public Comments(TJApiClient client) {
        super(client);
    }

    public CommentGetQuery getBy(String entryId) {
        return new CommentGetQuery(getClient(), entryId);
    }

    public CommentGetLikesQuery likes() {
        return new CommentGetLikesQuery(getClient());
    }

    public CommentSendQuery send() {
        return new CommentSendQuery(getClient());
    }

    public CommentEditQuery edit() {
        return new CommentEditQuery(getClient());
    }


}
