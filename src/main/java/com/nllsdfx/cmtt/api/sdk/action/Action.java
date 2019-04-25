package com.nllsdfx.cmtt.api.sdk.action;

import lombok.Getter;
import com.nllsdfx.cmtt.api.sdk.client.ApiClient;

@Getter
public abstract class Action {

    private final ApiClient client;

    public Action(ApiClient client) {
        this.client = client;
    }

}
