package ru.tjournal.api.sdk.model.response.tweets;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class Tweet {

    private String id;
    private String text;
    private TweetUser user;
    @SerializedName("retweet_count")
    private long retweetCount;
    @SerializedName("favorite_count")
    private int favoriteCount;
    @SerializedName("has_media")
    private boolean hasMedia;
    @SerializedName("media")
    private List<TweetMedia> tweetMedia;
    @SerializedName("created_at")
    private long createdAt;
}
