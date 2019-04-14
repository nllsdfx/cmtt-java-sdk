package ru.tjournal.api.sdk.query.vacancies;

import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.client.TJApiClient;
import ru.tjournal.api.sdk.model.response.job.Vacancy;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * https://cmtt-ru.github.io/osnova-api/redoc.html#operation/getJob
 */
public class VacancyGetQuery extends QueryBuilder<VacancyGetQuery, List<Vacancy>> {

    public VacancyGetQuery(TJApiClient client) {
        super(client, "job", Utils.buildParametrizedType(List.class, Vacancy.class));
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
