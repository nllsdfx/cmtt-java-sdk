package ru.tjournal.api.sdk.model.response.job;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Vacancy {

    private String id;
    private String title;
    @SerializedName("salary_to")
    private String salaryTo;
    @SerializedName("salary_from")
    private String salaryFrom;
    @SerializedName("salary_text")
    private String salaryText;
    private int area;
    @SerializedName("area_text")
    private String areaText;
    private int schedule;
    @SerializedName("schedule_text")
    private String scheduleText;
    @SerializedName("entry_id")
    private String entryId;
    @SerializedName("city_id")
    private int cityId;
    @SerializedName("city_name")
    private String cityName;
    private int favoritesCount;
    private boolean isFavorited;
    private Company company;
    @SerializedName("last_id")
    private String lastId;

}
