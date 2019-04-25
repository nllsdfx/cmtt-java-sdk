package com.nllsdfx.cmtt.api.sdk.model.response.users;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import com.nllsdfx.cmtt.api.sdk.model.AdvancedAccess;
import com.nllsdfx.cmtt.api.sdk.model.Counters;
import com.nllsdfx.cmtt.api.sdk.model.SocialAccount;

import java.util.List;

@Data
public class UserGetResponse {

    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    private String name;

    private long created;

    private String createdRFC;

    @SerializedName("avatar_url")
    private String avatarUrl;

    private int karma;

    @SerializedName("social_accounts")
    private List<SocialAccount> socialAccounts;

    @SerializedName("push_topic")
    private String pushTopic;

    @SerializedName("advanced_access")
    private AdvancedAccess advancedAccess;

    private Counters counters;

    private CoverUser cover;

    @SerializedName("user_hash")
    private String userHash;

}
