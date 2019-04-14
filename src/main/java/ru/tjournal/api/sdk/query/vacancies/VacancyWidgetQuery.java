package ru.tjournal.api.sdk.query.vacancies;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.client.QueryBuilder;
import ru.tjournal.api.sdk.model.response.job.Vacancy;
import ru.tjournal.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VacancyWidgetQuery extends QueryBuilder<VacancyWidgetQuery, List<Vacancy>> {

    public VacancyWidgetQuery(ApiClient client) {
        super(client, "vacancies/widget", Utils.buildParametrizedType(List.class, Vacancy.class));
    }

    @Override
    protected VacancyWidgetQuery _this() {
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
