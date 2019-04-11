package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AdvancedAccessActions {

    @SerializedName("read_comments")
    private boolean readComments;

    @SerializedName("write_comments")
    private boolean writeComments;

}
