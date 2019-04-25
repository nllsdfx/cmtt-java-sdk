package com.nllsdfx.cmtt.api.sdk.query.widgets;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.TJApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.Rates;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

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