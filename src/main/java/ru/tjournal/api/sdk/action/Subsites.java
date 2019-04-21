package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.subsite.*;

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

    public SubsiteUnsubscribeQuery unsubscribe() {
        return new SubsiteUnsubscribeQuery(getClient());
    }
}
