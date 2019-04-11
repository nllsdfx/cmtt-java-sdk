package ru.tjournal.api.sdk.client;

import org.junit.Assert;
import org.junit.Test;
import ru.tjournal.api.sdk.http.HttpTransportClient;

public class TestTJournalApiCLient {

    @Test
    public void testTJApiClient() throws Exception {

        TransportClient transportClient = HttpTransportClient.getInstance();

        TJApiClient client = new TJApiClient(transportClient, "1234");

        Assert.assertNotNull(client);

        Assert.assertEquals("1234", client.getToken());

        Assert.assertNotNull(client.getApiEndpoint());
        Assert.assertNotNull(client.getApiVersion());
        Assert.assertNotNull(client.getGson());

    }

}
