package ru.tjournal.api.sdk.model.response.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class UserGetResponse {

    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    private String name;

}
