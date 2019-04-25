package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.VCApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.job.JobFilters;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

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