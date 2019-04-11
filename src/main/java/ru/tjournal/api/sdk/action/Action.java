package ru.tjournal.api.sdk.action;

import lombok.Getter;
import ru.tjournal.api.sdk.client.TJApiClient;

@Getter
public abstract class Action {

    private final TJApiClient client;

    public Action(TJApiClient client) {
        this.client = client;
    }

}
