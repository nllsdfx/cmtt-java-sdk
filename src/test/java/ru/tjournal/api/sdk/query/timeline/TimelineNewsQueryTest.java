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

public class TimelineNewsQueryTest {

    @Test
    public void testTimelineNewsQuery() throws ClientException, ApiException {

        TimelineNewsQuery mock = Mockito.mock(TimelineNewsQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(mock.count(1).offset(0).execute()).thenReturn(Collections.singletonList(new Entry()));

        List<Entry> list = mock.count(1).offset(0).execute();
        assertNotNull(list);
        assertEquals(1, list.size());

    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Entry> list = client.timeline().timeLineNews().count(1).offset(1).execute();
        assertNotNull(list);
        assertEquals(1, list.size());
        assertNotNull(list.get(0));

    }

}