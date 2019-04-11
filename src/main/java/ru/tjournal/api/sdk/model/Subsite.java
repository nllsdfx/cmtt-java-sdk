package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Subsite {

    private String id;
    private String url;
    private int type;
    private String name;
    private String description;
    @SerializedName("avatar_url")
    private String avatarUrl;
    private SubsiteCover cover;
    @SerializedName("is_subscribed")
    private boolean isSubscribed;
    @SerializedName("is_verified")
    private boolean isVerified;
    @SerializedName("is_unsubscribable")
    private boolean isUnsubscribable;
    @SerializedName("subscribers_count")
    private long subscribersCount;
    @SerializedName("comments_count")
    private long commentsCount;
    @SerializedName("entries_count")
    private long entriesCount;
    @SerializedName("vacancies_count")
    private long vacanciesCount;


}
