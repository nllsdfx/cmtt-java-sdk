package ru.tjournal.api.sdk.query.entry;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;
import ru.tjournal.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class EntryLocateQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEntryLocateQuery() throws ClientException, ApiException {
        EntryLocateQuery mock = Mockito.mock(EntryLocateQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.url("http://example.com").execute()).thenReturn(new Entry());
        Entry entry = mock.url("http://example.com").execute();
        assertNotNull(entry);

        new EntryCreateQuery(new TJApiClient("test")).execute();
    }

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {

        TJApiClient client = new TJApiClient("test");

        Entry entry = client
                .entries()
                .locate()
                .url("https://tjournal.ru/irl/93282-foto-papa-rimskiy-celuet-nogi-lideram-yuzhnogo-sudana-umolyaya-sohranit-mir-v-strane")
                .execute();

        assertNotNull(entry);
        assertEquals("93282", entry.getId());

    }

}