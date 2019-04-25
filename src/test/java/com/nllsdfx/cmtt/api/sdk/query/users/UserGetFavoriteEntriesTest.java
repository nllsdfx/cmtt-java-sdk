package com.nllsdfx.cmtt.api.sdk.query.users;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.entry.Entry;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class UserGetFavoriteEntriesTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException, InterruptedException {
        Thread.sleep(1000);
        TJApiClient client = new TJApiClient("test");
        List<Entry> entries = client.users().favoriteEntries().of("2").count(1).offset(1).execute();
        assertNotNull(entries);
        assertEquals(1, entries.size());

    }

}