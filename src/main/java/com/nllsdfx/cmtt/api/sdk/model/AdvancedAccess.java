package com.nllsdfx.cmtt.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AdvancedAccess {

    @SerializedName("is_needs_advanced_access")
    private boolean isNeedsAdvanedAccess;

    private AdvancedAccessActions actions;

    @SerializedName("dtf_subscription")
    private Subscription dtfSubscription;

    @SerializedName("tv_subscription")
    private Subscription tvSubscription;

    @SerializedName("vc_subscription")
    private Subscription vcSubscription;

    private String hash;

}
