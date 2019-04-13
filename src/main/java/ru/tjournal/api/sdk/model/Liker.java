package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Liker {

    private String name;
    @SerializedName("avatar_url")
    private String avatarUlr;
    private int sign;

}
