package com.nllsdfx.cmtt.api.sdk.query.comments;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Liker;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CommentGetLikesQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentGetLikesQuery() throws ClientException, ApiException {
        CommentGetLikesQuery mock = Mockito.mock(CommentGetLikesQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.of("1").execute()).thenReturn(Collections.singletonMap("1", new Liker()));
        Map<String, Liker> execute = mock.of("1").execute();
        assertNotNull(execute);
        assertEquals(1, execute.size());

        new TJApiClient("test").comments().likes().execute();

    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Comment> popular = client.comments().getBy("93427").sorting("popular").execute();

        Map<String, Liker> likers = client.comments().likes().of(popular.get(0).getId()).execute();

        assertNotNull(likers);
        assertFalse(likers.isEmpty());

        Liker lolKekLiker = likers.get("238247");

        assertNotNull(lolKekLiker);
        assertEquals("lol kek", lolKekLiker.getName());
    }
}