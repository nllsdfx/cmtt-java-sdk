package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.job.JobFilters;

import java.util.Collection;
import java.util.Collections;

public class VacancyGetFiltersQuery extends QueryBuilder<VacancyGetFiltersQuery, JobFilters> {

    public VacancyGetFiltersQuery(ApiClient client) {
        super(client, "job/filters", JobFilters.class);
    }

    @Override
    protected VacancyGetFiltersQuery _this() {
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
