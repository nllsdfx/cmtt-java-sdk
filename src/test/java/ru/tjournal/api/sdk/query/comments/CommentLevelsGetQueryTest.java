package ru.tjournal.api.sdk.query.comments;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.CommentItems;
import ru.tjournal.api.sdk.model.response.comment.CommentsSorting;
import ru.tjournal.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class CommentLevelsGetQueryTest {


    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient apiClient = new TJApiClient("test");
        CommentItems items = apiClient.comments().commentsLevels().entryId("94266").sorting(CommentsSorting.POPULAR).execute();
        assertNotNull(items);
        assertFalse(items.getItems().isEmpty());
    }
}