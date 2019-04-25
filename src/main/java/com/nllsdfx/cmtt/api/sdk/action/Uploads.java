package com.nllsdfx.cmtt.api.sdk.action;

import com.nllsdfx.cmtt.api.sdk.client.ApiClient;
import com.nllsdfx.cmtt.api.sdk.query.upload.UploadExtractQuery;
import com.nllsdfx.cmtt.api.sdk.query.upload.UploadQuery;

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
