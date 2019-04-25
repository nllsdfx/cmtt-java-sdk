package com.nllsdfx.cmtt.api.sdk.query.comments;

import org.junit.Test;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;

public class CommentEditQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCommentEditQuery() throws ClientException, ApiException {
        new TJApiClient("test").comments().edit().execute();
    }



}