package ru.tjournal.api.sdk.query.comments;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.comment.CommentItems;
import ru.tjournal.api.sdk.model.response.comment.CommentsSorting;
import ru.tjournal.api.sdk.util.IntegrationTest;

public class CommentsLevelsPostQueryTest {

    @Test
    @Category(IntegrationTest.class)
    @Ignore
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        CommentItems items = client.comments()
                .commentsLevelsPost()
                .ids("2327906")
                .sorting(CommentsSorting.POPULAR)
                .entryId("94226").execute();

        Assert.assertNotNull(items);
        Assert.assertNotNull(items.getItems());
        Assert.assertFalse(items.getItems().isEmpty());
    }

}