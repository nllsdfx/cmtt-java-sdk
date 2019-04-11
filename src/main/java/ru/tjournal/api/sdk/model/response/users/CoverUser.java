package ru.tjournal.api.sdk.model.response.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CoverUser {

    @SerializedName("cover_url")
    private String coverUrl;

    private String height;

    private String width;

    private String type;

    private String y; // do not know what is it

}
