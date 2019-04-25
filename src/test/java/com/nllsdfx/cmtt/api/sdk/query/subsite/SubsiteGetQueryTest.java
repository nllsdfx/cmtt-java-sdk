package com.nllsdfx.cmtt.api.sdk.query.subsite;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Subsite;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class SubsiteGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSubsiteGetQuery() throws ClientException, ApiException {
        SubsiteGetQuery mock = Mockito.mock(SubsiteGetQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.id("1").execute()).thenReturn(new Subsite());
        Subsite execute = mock.id("1").execute();
        assertNotNull(execute);
        new SubsiteGetQuery(new TJApiClient("test")).execute();
    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException, InterruptedException {
        Thread.sleep(1000);
        TJApiClient client = new TJApiClient("test");
        List<Entry> list = client.timeline().timeLineNews().count(1).execute();
        assertNotNull(list);
        assertFalse(list.isEmpty());

        Entry entry = list.get(0);

        Subsite subsite = entry.getSubsite();
        assertNotNull(subsite);

        Subsite execute = client.subsites().get().id(subsite.getId()).execute();

        assertEquals(subsite.getId(), execute.getId());
        assertEquals(subsite.getName(), execute.getName());
    }

}