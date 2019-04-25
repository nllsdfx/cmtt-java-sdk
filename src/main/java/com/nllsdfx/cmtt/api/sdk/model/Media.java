package com.nllsdfx.cmtt.api.sdk.model;

import lombok.Data;

@Data
public class Media {

    private int type;
    private String imageUrl;
    private String iframeUrl;
    private String service;
    private AdditionalData additionalData;
    private Size size;

}
