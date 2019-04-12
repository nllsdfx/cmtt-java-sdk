package ru.tjournal.api.sdk.query.entry;

import org.junit.Test;
import org.mockito.Mockito;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.entry.Entry;

import static org.junit.Assert.*;

public class EntryCreateQueryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEntryCreateQuery() throws ClientException, ApiException {

        EntryCreateQuery mock = Mockito.mock(EntryCreateQuery.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.attachments("1234").text("test").title("title").subsiteId(1).execute()).thenReturn(new Entry());
        Entry execute = mock.attachments("1234").text("test").title("title").subsiteId(1).execute();
        assertNotNull(execute);

        new EntryCreateQuery(new TJApiClient("token")).execute();
    }

}