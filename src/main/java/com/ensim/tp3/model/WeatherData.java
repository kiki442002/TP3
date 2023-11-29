package com.ensim.tp3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherData(@JsonProperty("forecast") Forecast[] forecast, @JsonProperty("update") String update) {
    public record Forecast(@JsonProperty("day") int day, @JsonProperty("date") String date,
                            @JsonProperty("wind10m") int wind10m, @JsonProperty("gust10m") int gust10m,
                            @JsonProperty("dirwind10m") int dirwind10m, @JsonProperty("rr10") int rr10,
                            @JsonProperty("probarain") int probarain, @JsonProperty("weather") int weather,
                            @JsonProperty("rr1") int rr1, @JsonProperty("tmin") int tmin,
                            @JsonProperty("tmax") int tmax, @JsonProperty("probafrost") int probafrost,
                            @JsonProperty("probafog") int probafog, @JsonProperty("probawind70") int probawind70,
                            @JsonProperty("probawind100") int probawind100, @JsonProperty("sun_hours") int sun_hours,
                            @JsonProperty("etp") int etp, @JsonProperty("gustx") int gustx) { }


}

