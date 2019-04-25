package com.nllsdfx.cmtt.api.sdk.query.layout;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.EntryContent;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class LayoutGetByHashtagQueryTest {

    @Test
    @Category(IntegrationTest.class)
    @Ignore
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        EntryContent content = client.layout().hastagLayout().hashtag("#политика").execute();
        assertNotNull(content);
        assertNotNull(content.getHtml());
        assertNotNull(content.getVersion());
    }

}