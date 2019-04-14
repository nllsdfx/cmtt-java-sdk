package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.payments.PaymentsCheckQuery;

public class Payments extends Action {

    public Payments(ApiClient client) {
        super(client);
    }

    public PaymentsCheckQuery paymentsCheck() {
        return new PaymentsCheckQuery(getClient());
    }
}
