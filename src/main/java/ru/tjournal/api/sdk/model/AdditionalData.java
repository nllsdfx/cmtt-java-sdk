package ru.tjournal.api.sdk.model;

import lombok.Data;

@Data
public class AdditionalData {

    private String type;
    private String url;
    private String uuid;
    private int duration;
    private boolean hasAudio;

}
