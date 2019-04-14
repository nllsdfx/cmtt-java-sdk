package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.vacancies.VacancyGetQuery;

public class Vacancies extends Action {

    public Vacancies(ApiClient client) {
        super(client);
    }

    public VacancyGetQuery get() {
        return new VacancyGetQuery(getClient());
    }
}
