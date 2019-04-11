package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Likes {

    long count;
    long sum;

    @SerializedName("is_liked")
    int isLiked;

    @SerializedName("is_hidden")
    boolean isHidden;

}
