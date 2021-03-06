package com.nllsdfx.cmtt.api.sdk.model.response.upload;

import lombok.Data;

@Data
public class AttachmentImage {

    private String id;
    private String uuid;
    private String additionalData;
    private String type;
    private String color;
    private float width;
    private float height;
    private int size;
    private String name;
    private String origin;
    private String title;
    private String description;
    private String url;
}
