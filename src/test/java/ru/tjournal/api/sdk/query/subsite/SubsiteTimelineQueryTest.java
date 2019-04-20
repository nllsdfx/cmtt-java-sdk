package ru.tjournal.api.sdk.query.subsite;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class SubsiteTimelineQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException, InterruptedException {
        Thread.sleep(1000);
        TJApiClient client = new TJApiClient("tst");
        String subsiteId = client.entries().get().by("93603").execute().getSubsite().getId();
        assertNotNull(subsiteId);
        List<Entry> entries = client.subsites().timeline().id(subsiteId).sorting("new").count(5).execute();
        assertNotNull(entries);
        assertEquals(5, entries.size());
        for (Entry entry : entries) {
            assertEquals(subsiteId, entry.getSubsite().getId());
        }
    }

}