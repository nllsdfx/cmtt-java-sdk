package ru.tjournal.api.sdk.model.response.tweets;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class TweetUser {

    @SerializedName("created_at")
    private long createdAt;
    @SerializedName("followers_count")
    private long followersCount;
    @SerializedName("friends_count")
    private long friendsCount;

    private String id;
    private String name;
    @SerializedName("profile_image_url")
    private String profileImageUrl;
    @SerializedName("profile_image_url_bigger")
    private String profileImageUrlBigger;
    @SerializedName("screen_name")
    private String screenName;
    @SerializedName("statuses_count")
    private long statusesCount;
}
