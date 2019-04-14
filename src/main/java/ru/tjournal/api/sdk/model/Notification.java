package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import ru.tjournal.api.sdk.model.response.users.UserGetResponse;

import java.util.List;

@Data
public class Notification {

    private String id;
    private int type;
    private long date;
    private String dateRFC;
    private List<UserGetResponse> users;
    private String text;
    @SerializedName("comment_text")
    private String commentText;
    private String url;
    private String icon;

}
