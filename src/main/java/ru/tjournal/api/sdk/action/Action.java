package ru.tjournal.api.sdk.action;

import lombok.Getter;
import ru.tjournal.api.sdk.client.ApiClient;

@Getter
public abstract class Action {

    private final ApiClient client;

    public Action(ApiClient client) {
        this.client = client;
    }

}
