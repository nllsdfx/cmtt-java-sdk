package com.nllsdfx.cmtt.api.sdk.model.response.entry;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.nllsdfx.cmtt.api.sdk.model.AdditionalData;
import com.nllsdfx.cmtt.api.sdk.model.Size;

@Data
public class Cover {

    private int type;

    private AdditionalData additionalData;

    private String thumbnailUrl;

    private String url;

    private Size size;

    @SerializedName("size_simple")
    private String sizeSimple;

}
