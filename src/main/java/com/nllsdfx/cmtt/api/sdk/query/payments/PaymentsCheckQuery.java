package com.nllsdfx.cmtt.api.sdk.query.payments;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.client.QueryBuilder;

import java.util.Collection;
import java.util.Collections;

public class PaymentsCheckQuery extends QueryBuilder<PaymentsCheckQuery, Boolean> {

    public PaymentsCheckQuery(ApiClient client) {
        super(client, "payments/check", Boolean.class);
    }

    @Override
    protected PaymentsCheckQuery _this() {
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
