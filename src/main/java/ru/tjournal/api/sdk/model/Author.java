package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Author {

    private String id;

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    private String name;

    private int gender;

    private String url;

    @SerializedName("avatar_url")
    private String avatarUrl;

    private long karma;
}
