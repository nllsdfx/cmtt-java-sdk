package com.nllsdfx.cmtt.api.sdk.model.response.tweets;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TweetMedia {

    private int type;

    @SerializedName("thumbnail_url")
    private String thumbnailUrl;
    @SerializedName("media_url")
    private String mediaUrl;
    @SerializedName("thumbnail_width")
    private float thumbnailWidth;
    @SerializedName("thumbnail_height")
    private float thumbnailHeight;

    private float ratio;
}
