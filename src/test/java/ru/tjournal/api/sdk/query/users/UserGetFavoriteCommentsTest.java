package ru.tjournal.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.Comment;
import ru.tjournal.api.sdk.util.IntegrationTest;

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