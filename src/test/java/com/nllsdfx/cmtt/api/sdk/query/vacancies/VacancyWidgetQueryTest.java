package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.nllsdfx.cmtt.api.sdk.client.VCApiClient;
import com.nllsdfx.cmtt.api.sdk.exception.ApiException;
import com.nllsdfx.cmtt.api.sdk.exception.ClientException;
import com.nllsdfx.cmtt.api.sdk.model.response.job.Vacancy;
import com.nllsdfx.cmtt.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class VacancyWidgetQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        VCApiClient apiClient = new VCApiClient("test");
        List<Vacancy> vacancies = apiClient.vacancies().widget().execute();
        assertNotNull(vacancies);
        assertFalse(vacancies.isEmpty());
    }

}