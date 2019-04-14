package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.vacancies.VacancyGetQuery;
import ru.tjournal.api.sdk.query.vacancies.VacancyLoadMoreQuery;

public class Vacancies extends Action {

    public Vacancies(ApiClient client) {
        super(client);
    }

    public VacancyGetQuery get() {
        return new VacancyGetQuery(getClient());
    }

    public VacancyLoadMoreQuery loadMore() {
        return new VacancyLoadMoreQuery(getClient());
    }
}
