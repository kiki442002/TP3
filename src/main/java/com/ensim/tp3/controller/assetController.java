package com.ensim.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class assetController {
    @GetMapping("/stylesheet.css")
    public String getStylesheet() {
        return "stylesheet.css";
    }
}
