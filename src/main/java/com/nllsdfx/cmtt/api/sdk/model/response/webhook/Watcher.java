package com.nllsdfx.cmtt.api.sdk.model.response.webhook;

import lombok.Data;

@Data
public class Watcher {

    private String id;
    private String event;
    private String url;

}
