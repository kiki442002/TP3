package com.ensim.tp3.controller;

import com.ensim.tp3.model.FeatureCollection;
import com.ensim.tp3.model.WeatherData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    private static final String TOKEN = "ce38c3036f77ec645780dcd805a14928edc7d855c481f9fd8f5516dd24057bc3";
    @PostMapping ("/meteo")
    public String showMeteo(@RequestParam(name="address", required=true) String addressPOST, @RequestParam(name="day", required=true) String day, Model model, RestTemplate restTemplate) {
        FeatureCollection featureCollection = restTemplate.getForObject(
                "https://api-adresse.data.gouv.fr/search/?limit=1&q="+addressPOST, FeatureCollection.class);
        if (featureCollection == null) {
            return "error";
        }

        WeatherData wheatherData = restTemplate.getForObject(
                "https://api.meteo-concept.com/api/forecast/daily?world=false&start=0&end="+day+
                        "&token="+TOKEN+"&latlong="+featureCollection.getAPICoordinates()
                , WeatherData.class);

        if (wheatherData == null) {
            return "error";
        }
        model.addAttribute("Allforecast", wheatherData.forecast());
        return "meteo";
    }

    @GetMapping("/MeteoAdresse")
    public String showMeteoAdresse() {
        return "adresseMeteo";
    }
}

