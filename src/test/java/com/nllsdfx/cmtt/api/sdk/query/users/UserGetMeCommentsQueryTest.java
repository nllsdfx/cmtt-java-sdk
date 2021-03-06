package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class UserGetMeCommentsQueryTest {

    @Test
    public void test() throws ClientException, ApiException {
        UserGetMeCommentsQuery mock = Mockito.mock(UserGetMeCommentsQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.count(1).execute()).thenReturn(Collections.singletonList(new Comment()));
        List<Comment> execute = mock.count(1).execute();
        assertNotNull(execute);
        assertEquals(1, execute.size());
    }

}