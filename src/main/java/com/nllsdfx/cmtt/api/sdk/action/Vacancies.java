package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.vacancies.VacancyGetFiltersQuery;
import com.nllsdfx.cmtt.api.sdk.query.vacancies.VacancyGetQuery;
import com.nllsdfx.cmtt.api.sdk.query.vacancies.VacancyLoadMoreQuery;
import com.nllsdfx.cmtt.api.sdk.query.vacancies.VacancyWidgetQuery;

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

    public VacancyGetFiltersQuery getFilters() {
        return new VacancyGetFiltersQuery(getClient());
    }

    public VacancyWidgetQuery widget() {
        return new VacancyWidgetQuery(getClient());
    }
}
