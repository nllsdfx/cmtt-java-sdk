package com.nllsdfx.cmtt.api.sdk.query.comments;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentItems;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentsSorting;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

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