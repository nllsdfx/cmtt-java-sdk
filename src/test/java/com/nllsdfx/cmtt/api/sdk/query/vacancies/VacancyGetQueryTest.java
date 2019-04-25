package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.VCApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.job.Vacancy;
import com.nllsdfx.cmtt.api.sdk.model.response.job.VacancyItems;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class VacancyGetQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        VCApiClient client = new VCApiClient("test");
        VacancyItems items  = client.vacancies().get().execute();
        assertNotNull(items);
        assertNotNull(items.getLastId());
        List<Vacancy> vacancies = items.getItems();

        assertFalse(vacancies.isEmpty());

        for (Vacancy vacancy : vacancies) {
            assertNotNull(vacancy.getId());
            assertNotNull(vacancy.getTitle());
            assertNotNull(vacancy.getSalaryText());
        }
    }

}