package ru.tjournal.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.VCApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.job.JobFilters;
import ru.tjournal.api.sdk.util.IntegrationTest;

import static org.junit.Assert.*;

public class VacancyGetFiltersQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        VCApiClient client = new VCApiClient("test");
        JobFilters filters = client.vacancies().getFilters().execute();
        assertNotNull(filters);
        assertNotNull(filters.getArea());
        assertNotNull(filters.getCities());
        assertNotNull(filters.getSchedule());
        assertNotNull(filters.getSpecializations());
    }

}