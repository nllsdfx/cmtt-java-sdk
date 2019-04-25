package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.payments.PaymentsCheckQuery;

public class Payments extends Action {

    public Payments(ApiClient client) {
        super(client);
    }

    public PaymentsCheckQuery paymentsCheck() {
        return new PaymentsCheckQuery(getClient());
    }
}
