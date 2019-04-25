package com.nllsdfx.cmtt.api.sdk.query.timeline;

import org.junit.Test;

import static org.mockito.Mockito.*;

import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TimelineGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTimelineGet() throws ClientException, ApiException {

        TimelineGetQuery query = mock(TimelineGetQuery.class, RETURNS_DEEP_STUBS);


        when(query
                .category("index")
                .sorting("recent")
                .count(1)
                .offset(0)
                .execute()).thenReturn(Collections.singletonList(new Entry()));

        List<Entry> list = query
                .category("index")
                .sorting("recent")
                .count(1)
                .offset(0)
                .execute();

        assertNotNull(list);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());

        // must throw exception
        new TimelineGetQuery(new TJApiClient("test")).execute();

    }

    @Test
    @Category(IntegrationTest.class)
    public void TimelineGetIntegrationTest() throws ClientException, ApiException, InterruptedException {

        Thread.sleep(1000); // tj says no more than 3 calls per second... simple workaround for now

        TJApiClient client = new TJApiClient("test_token");

        List<Entry> responseList = client
                .timeline().get()
                .count(10)
                .category("index")
                .sorting("recent")
                .execute();

        assertNotNull(responseList);
        assertEquals(10, responseList.size());

        for (Entry item : responseList) {
            assertNotNull(item.getAuthor());
            assertNotNull(item.getTitle());
            assertNotNull(item.getId());
        }

    }

}