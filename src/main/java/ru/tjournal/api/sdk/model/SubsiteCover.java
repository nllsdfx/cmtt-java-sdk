package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class SubsiteCover {

    @SerializedName("cover_url")
    private String coverUrl;

}
