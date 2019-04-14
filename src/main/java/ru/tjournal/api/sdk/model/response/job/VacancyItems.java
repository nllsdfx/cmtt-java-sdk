package ru.tjournal.api.sdk.model.response.job;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class VacancyItems {

    private List<Vacancy> items;

    @SerializedName("last_id")
    private String lastId;
}
