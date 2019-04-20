package ru.tjournal.api.sdk.model.response.upload;

import lombok.Data;

@Data
public class UploadResponse {

    private String type;
    private Attachment data;
}
