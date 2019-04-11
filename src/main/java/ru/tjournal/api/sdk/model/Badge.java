package ru.tjournal.api.sdk.model;

import lombok.Data;

@Data
public class Badge {

    private String type;
    private String text;
    private String color;
    private String background;
    private String border;

}
