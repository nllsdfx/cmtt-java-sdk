package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.job.Vacancy;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

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
