package com.nllsdfx.cmtt.api.sdk.query.vacancies;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.response.job.VacancyItems;

import java.util.Collection;
import java.util.Collections;

public class VacancyLoadMoreQuery extends QueryBuilder<VacancyLoadMoreQuery, VacancyItems> {

    public VacancyLoadMoreQuery(ApiClient client) {
        super(client, "job/more/{last_id}", VacancyItems.class);
    }

    public VacancyLoadMoreQuery lastId(String lastId) {
        return unsafePath("last_id", lastId);
    }

    @Override
    protected VacancyLoadMoreQuery _this() {
        return this;
    }

    @Override
    protected Collection<String> essentialKeys() {
        return Collections.emptyList();
    }

    @Override
    protected Collection<String> essentialPathKeys() {
        return Collections.singletonList("last_id");
    }
}
