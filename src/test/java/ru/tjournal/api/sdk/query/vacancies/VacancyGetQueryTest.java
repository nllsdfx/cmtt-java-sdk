package ru.tjournal.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.VCApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.job.Vacancy;
import ru.tjournal.api.sdk.model.response.job.VacancyItems;
import ru.tjournal.api.sdk.util.IntegrationTest;

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