package ru.tjournal.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.job.Vacancy;
import ru.tjournal.api.sdk.util.IntegrationTest;

import java.util.List;

import static org.junit.Assert.*;

public class VacancyGetQueryTest {

    @Test
    @Category(IntegrationTest.class)
    public void integration() throws ClientException, ApiException {
        TJApiClient client = new TJApiClient("test");
        List<Vacancy> vacancies = client.vacancies().get().execute();
        assertNotNull(vacancies);
        assertFalse(vacancies.isEmpty());
        for (Vacancy vacancy : vacancies) {
            assertNotNull(vacancy.getId());
            assertNotNull(vacancy.getTitle());
            assertNotNull(vacancy.getSalaryText());
        }
    }

}