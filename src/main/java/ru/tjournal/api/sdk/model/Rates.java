package ru.tjournal.api.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Rates {

    @SerializedName("USD")
    private Rate usd;
    @SerializedName("EUR")
    private Rate eur;
    @SerializedName("BTC")
    private Rate btc;
    @SerializedName("ETH")
    private Rate eth;

}
