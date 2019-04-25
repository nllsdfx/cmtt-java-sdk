package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.VCApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.job.VacancyItems;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class VacancyLoadMoreQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        VCApiClient client = new VCApiClient("tst");
        VacancyItems items = client.vacancies().get().execute();
        VacancyItems vacancyItems = client.vacancies().loadMore().lastId(items.getLastId()).execute();
        assertNotNull(vacancyItems);

    }

}