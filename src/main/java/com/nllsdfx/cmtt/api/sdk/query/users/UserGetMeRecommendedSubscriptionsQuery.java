package com.nllsdfx.cmtt.api.sdk.query.users;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;
import com.nllsdfx.cmtt.api.sdk.model.Subsite;
import com.nllsdfx.cmtt.api.sdk.util.Utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Получить рекомендуемые подсайты
 */
public class UserGetMeRecommendedSubscriptionsQuery extends QueryBuilder<UserGetMeRecommendedSubscriptionsQuery, List<Subsite>> {

    public UserGetMeRecommendedSubscriptionsQuery(ApiClient client) {
        super(client, "user/me/subscriptions/recommended", Utils.buildParametrizedType(List.class, Subsite.class));
    }

    @Override
    protected UserGetMeRecommendedSubscriptionsQuery _this() {
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
