package ru.tjournal.api.sdk.query.comments;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CommentGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentGet() throws ClientException, ApiException {

        CommentGetQuery mock = Mockito.mock(CommentGetQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(mock.sorting("recent").execute()).thenReturn(Collections.emptyList());

        List<Comment> list = mock.sorting("recent").execute();

        assertNotNull(list);
        assertTrue(list.isEmpty());

        new CommentGetQuery(new TJApiClient("23"), "1").execute();

    }

    @Test(expected = ClientException.class)
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");

        List<Comment> comments = client.entries().comments("93120").sorting("popular").execute();

        assertNotNull(comments);
        assertFalse(comments.isEmpty());

        for (Comment comment : comments) {

            assertNotNull(comment.getAuthor());
            assertNotNull(comment.getDateRFC());
            assertNotNull(comment.getId());
            assertNotNull(comment.getLikes());

        }

        // has to throw exception (comments are closed for the token test)
        client.entries().comments("93076").sorting("recent").execute();

    }

}