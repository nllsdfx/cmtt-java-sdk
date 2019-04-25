package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.entry.*;

public class Entries extends Action {

    public Entries(ApiClient client) {
        super(client);
    }

    public EntryGetQuery get() {
        return new EntryGetQuery(getClient());
    }

    public EntriesGetPopularQuery popular() {
        return new EntriesGetPopularQuery(getClient());
    }

    public EntryLikeQuery like() {
        return new EntryLikeQuery(getClient());
    }

    public EntryCreateQuery create() {
        return new EntryCreateQuery(getClient());
    }

    public EntryLocateQuery locate() {
        return new EntryLocateQuery(getClient());
    }

}
