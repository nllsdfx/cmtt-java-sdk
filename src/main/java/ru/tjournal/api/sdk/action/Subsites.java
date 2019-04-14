package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.subsite.SubsiteGetQuery;

public class Subsites extends Action {

    public Subsites(ApiClient client) {
        super(client);
    }

    public SubsiteGetQuery get() {
        return new SubsiteGetQuery(getClient());
    }
}
