package ru.tjournal.api.sdk.query.widgets;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.Rates;
import ru.tjournal.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class WidgetGetRatesQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("tst");
        Rates rates = client.widgets().rates().execute();
        assertNotNull(rates);
        assertNotNull(rates.getBtc());
        assertNotNull(rates.getEur());
        assertNotNull(rates.getUsd());
        assertNotNull(rates.getEth());
        assertNotNull(rates.getEth().getChange());
        assertNotNull(rates.getEth().getRate());
        assertNotNull(rates.getEth().getSym());
    }

}