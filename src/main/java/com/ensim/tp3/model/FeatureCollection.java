package com.ensim.tp3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public record FeatureCollection(@JsonProperty("features") Feature[] features){
    private record Feature(@JsonProperty("geometry") Geometry geometry){

    }
    private record Geometry(@JsonProperty("coordinates") double[] coordinates){}


    public String getAPICoordinates(){
        return features[0].geometry.coordinates[0] + "%2C" + features[0].geometry.coordinates[1];
    }


}

