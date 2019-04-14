package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.query.vacancies.VacancyGetQuery;

public class Vacancies extends Action {

    public Vacancies(TJApiClient client) {
        super(client);
    }

    public VacancyGetQuery get() {
        return new VacancyGetQuery(getClient());
    }
}
