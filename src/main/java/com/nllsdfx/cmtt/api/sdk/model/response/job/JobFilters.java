package com.nllsdfx.cmtt.api.sdk.model.response.job;

import lombok.Data;

import java.util.List;

@Data
public class JobFilters {

    private List<JobFilter> area;
    private List<JobFilter> cities;
    private List<JobFilter> schedule;
    private List<JobFilter> specializations;
}
