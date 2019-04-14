package ru.tjournal.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.VCApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.job.Vacancy;
import ru.tjournal.api.sdk.util.IntegrationTest;

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