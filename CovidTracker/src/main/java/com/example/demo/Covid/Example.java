
package com.example.demo.Covid;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cases_time_series"
})
public class Example {

    @JsonProperty("cases_time_series")
    private List<CasesTimeSeries> casesTimeSeries = null;
   
    @JsonProperty("cases_time_series")
    public List<CasesTimeSeries> getCasesTimeSeries() {
        return casesTimeSeries;
    }

    @JsonProperty("cases_time_series")
    public void setCasesTimeSeries(List<CasesTimeSeries> casesTimeSeries) {
        this.casesTimeSeries = casesTimeSeries;
    }

   

}
