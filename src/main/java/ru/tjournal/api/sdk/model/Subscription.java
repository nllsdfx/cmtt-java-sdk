package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Subscription {

    @SerializedName("is_active")
    private boolean isActive;

    @SerializedName("active_until")
    private long activeUntil;

}
