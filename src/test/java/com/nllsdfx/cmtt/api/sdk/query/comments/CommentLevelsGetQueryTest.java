package com.nllsdfx.cmtt.api.sdk.query.comments;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentItems;
import com.nllsdfx.cmtt.api.sdk.model.response.comment.CommentsSorting;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class CommentLevelsGetQueryTest {


    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient apiClient = new TJApiClient("test");
        CommentItems items = apiClient.comments().commentsLevels().entryId("94266").sorting(CommentsSorting.POPULAR).execute();
        assertNotNull(items);
        assertFalse(items.getItems().isEmpty());
        CommentItems execute = apiClient.comments().commentsLevels().entryId("94266").sorting(CommentsSorting.DATE).execute();
        assertNotNull(execute);
        assertFalse(execute.getItems().isEmpty());
    }
}