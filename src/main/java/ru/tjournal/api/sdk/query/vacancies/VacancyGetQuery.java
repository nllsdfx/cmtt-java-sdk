package ru.tjournal.api.sdk.query.vacancies;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.job.VacancyItems;

import java.util.Collection;
import java.util.Collections;

/**
 * https://cmtt-ru.github.io/osnova-api/redoc.html#operation/getJob
 */
public class VacancyGetQuery extends QueryBuilder<VacancyGetQuery, VacancyItems> {

    public VacancyGetQuery(ApiClient client) {
        super(client, "job", VacancyItems.class);
    }

    @Override
    protected VacancyGetQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.emptyList();
    }
}
