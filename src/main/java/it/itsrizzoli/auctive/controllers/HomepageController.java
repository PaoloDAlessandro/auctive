package it.itsrizzoli.auctive.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomepageController {

    @GetMapping("/")
    public String getHomepage() {
        return "index";
    }

    @PostMapping("/")
    public String checkPersonInfo(BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "index";
        return "redirect:/research-results";
    }
/*
    @GetMapping("/research-results")
    public String results() { return "research-results"; } */
}

