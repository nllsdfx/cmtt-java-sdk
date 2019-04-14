package ru.tjournal.api.sdk.query.vacancies;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.tjournal.api.sdk.client.VCApiClient;
import ru.tjournal.api.sdk.exception.ApiException;
import ru.tjournal.api.sdk.exception.ClientException;
import ru.tjournal.api.sdk.model.response.job.VacancyItems;
import ru.tjournal.api.sdk.util.IntegrationTest;

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