package ru.tjournal.api.sdk.action;

import ru.tjournal.api.sdk.client.ApiClient;
import ru.tjournal.api.sdk.query.upload.UploadExtractQuery;
import ru.tjournal.api.sdk.query.upload.UploadQuery;

public class Uploads extends Action {

    public Uploads(ApiClient client) {
        super(client);
    }

    public UploadQuery upload() {
        return new UploadQuery(getClient());
    }

    public UploadExtractQuery extract() {
        return new UploadExtractQuery(getClient());
    }
}
