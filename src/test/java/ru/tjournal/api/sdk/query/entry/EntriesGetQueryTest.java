package ru.tjournal.api.sdk.query.entry;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

public class EntriesGetQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void get() throws ClientException, ApiException {

        EntryGetQuery mock = Mockito.mock(EntryGetQuery.class, Mockito.RETURNS_DEEP_STUBS);

        Mockito.when(mock.by("1").execute()).thenReturn(new Entry());

        Entry execute = mock.by("1").execute();

        Assert.assertNotNull(execute);

        new EntryGetQuery(new TJApiClient("test")).execute();

    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");
        Entry entry = client.entries().get().by("93120").execute();
        Assert.assertNotNull(entry);
        Assert.assertEquals("93120", entry.getId());
        Assert.assertEquals("Женя Кузьмин", entry.getAuthor().getName());
    }
}