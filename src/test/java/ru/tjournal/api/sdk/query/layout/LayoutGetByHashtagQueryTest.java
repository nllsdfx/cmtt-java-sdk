package ru.tjournal.api.sdk.query.layout;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.EntryContent;
import ru.tjournal.api.sdk.util.IntegrationTest;

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