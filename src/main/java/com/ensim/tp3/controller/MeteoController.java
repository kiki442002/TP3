package com.ensim.tp3.controller;

import com.ensim.tp3.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
    @Autowired
    AddressRepository addressRepository;

    @PostMapping ("/meteo")
    public String showMeteo(@RequestParam(name="address", required=true) String adressPOST, Model model) {
        model.addAttribute("address", adressPOST);
        return "meteo";
    }

    @GetMapping("/addresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "adresseMeteo";
    }
}

