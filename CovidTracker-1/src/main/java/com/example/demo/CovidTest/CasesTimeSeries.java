
package com.example.demo.CovidTest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"date",
    "dailyconfirmed",
    "dailydeceased",
    "dailyrecovered",
    
})
public class CasesTimeSeries {

	@JsonProperty("date")
    private String date;
    @JsonProperty("dailyconfirmed")
    private String dailyconfirmed;
    @JsonProperty("dailydeceased")
    private String dailydeceased;
    @JsonProperty("dailyrecovered")
    private String dailyrecovered;

    
    
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }
   
    @JsonProperty("dailyconfirmed")
    public String getDailyconfirmed() {
        return dailyconfirmed;
    }

    @JsonProperty("dailyconfirmed")
    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    @JsonProperty("dailydeceased")
    public String getDailydeceased() {
        return dailydeceased;
    }

    @JsonProperty("dailydeceased")
    public void setDailydeceased(String dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    @JsonProperty("dailyrecovered")
    public String getDailyrecovered() {
        return dailyrecovered;
    }

    @JsonProperty("dailyrecovered")
    public void setDailyrecovered(String dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

   
}
