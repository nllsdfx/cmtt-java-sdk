package ru.tjournal.api.sdk.query.comments;

import org.junit.Test;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;

public class CommentEditQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentEditQuery() throws ClientException, ApiException {
        new TJApiClient("test").comments().edit().execute();
    }



}