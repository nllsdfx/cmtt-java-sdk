package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.Comment;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class UserGetFavoriteCommentsTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Comment> comments = client.users().favoriteComments().count(1).of("2").execute();
        assertNotNull(comments);
        assertEquals(1, comments.size());
    }

}