package ru.tjournal.api.sdk.query.timeline;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TimelineByHashtagQueryTest {

    @Test
    public void testTimelineByHashtagQuery() throws ClientException, ApiException {
        TimelineByHashtagQuery mock = Mockito.mock(TimelineByHashtagQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.count(1).hastag("#политика").execute()).thenReturn(Collections.singletonList(new Entry()));
        List<Entry> list = mock.count(1).hastag("#политика").execute();
        assertNotNull(list);
        assertEquals(1, list.size());

    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException, InterruptedException {

        Thread.sleep(500);

        TJApiClient apiClient = new TJApiClient("test");

        List<Entry> list = apiClient.timeline().getByHashtag().count(10).hastag("#политика").execute();

        assertNotNull(list);
        assertEquals(10, list.size());

        for (Entry entry : list) {
            assertNotNull(entry.getId());
            assertNotNull(entry.getAuthor());
            assertNotNull(entry.getTitle());
        }

    }

}