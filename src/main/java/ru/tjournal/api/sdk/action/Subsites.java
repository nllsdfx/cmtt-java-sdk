package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.subsite.SubsiteGetQuery;
import ru.tjournal.api.sdk.query.subsite.SubsiteListQuery;
import ru.tjournal.api.sdk.query.subsite.SubsiteSubscribeQuery;
import ru.tjournal.api.sdk.query.subsite.SubsiteTimelineQuery;

public class Subsites extends Action {

    public Subsites(ApiClient client) {
        super(client);
    }

    public SubsiteGetQuery get() {
        return new SubsiteGetQuery(getClient());
    }

    public SubsiteTimelineQuery timeline() {
        return new SubsiteTimelineQuery(getClient());
    }

    public SubsiteListQuery list() {
        return new SubsiteListQuery(getClient());
    }

    public SubsiteSubscribeQuery subscribe() {
        return new SubsiteSubscribeQuery(getClient());
    }
}
