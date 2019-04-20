package ru.tjournal.api.sdk.model.response.upload;

import lombok.Data;

@Data
public class Image {

    private String type;

    private AttachmentImage data;

}
