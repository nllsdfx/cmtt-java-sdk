package ru.tjournal.api.sdk.query.comments;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.Comment;

import static org.junit.Assert.assertNotNull;

public class CommentSendQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentSendQuery() throws ClientException, ApiException {
        CommentSendQuery mock = Mockito.mock(CommentSendQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.entryId("1").text("hello").execute()).thenReturn(new Comment());
        Comment comment = mock.entryId("1").text("hello").execute();
        assertNotNull(comment);

        new TJApiClient("test").comments().send().execute();
    }


}