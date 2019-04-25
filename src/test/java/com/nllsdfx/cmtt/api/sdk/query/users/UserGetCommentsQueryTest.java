package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UserGetCommentsQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testUserGetCommentsQuery() throws ClientException, ApiException {
        UserGetCommentsQuery mock = Mockito.mock(UserGetCommentsQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.of("1").count(1).offset(1).execute()).thenReturn(Collections.singletonList(new Comment()));
        List<Comment> execute = mock.of("1").count(1).offset(1).execute();
        assertNotNull(execute);
        assertFalse(execute.isEmpty());
        new UserGetCommentsQuery(new TJApiClient("1")).execute();
    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");
        List<Comment> comments = client.users().comments().of("2").count(10).execute();
        assertNotNull(comments);
        assertEquals(10, comments.size());

    }


}