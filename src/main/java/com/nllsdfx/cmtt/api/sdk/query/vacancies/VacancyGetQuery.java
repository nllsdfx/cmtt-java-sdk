package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.job.VacancyItems;

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
