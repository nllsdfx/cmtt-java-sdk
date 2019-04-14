package ru.tjournal.api.sdk.query.comments;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.model.response.comment.CommentItems;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CommentGetThreadQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentGetThreadQuery() throws ClientException, ApiException {
        CommentGetThreadQuery mock = Mockito.mock(CommentGetThreadQuery.class, Mockito.RETURNS_DEEP_STUBS);

        CommentItems items = new CommentItems();
        List<Comment> comments = Collections.singletonList(new Comment());
        items.setItems(comments);

        Mockito.when(mock.comment("1").entry("1").execute()).thenReturn(items);

        CommentItems execute = mock.comment("1").entry("1").execute();
        assertEquals(items, execute);
        assertFalse(execute.getItems().isEmpty());

        new CommentGetThreadQuery(new TJApiClient("test")).execute();
    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");
        CommentItems items = client.comments().thread().comment("2313906").entry("93393").execute();
        assertNotNull(items);
        List<Comment> list = items.getItems();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        assertEquals("2313906", list.get(0).getId());
    }

}