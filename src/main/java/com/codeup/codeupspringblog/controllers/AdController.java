package com.codeup.codeupspringblog.controllers;

//import com.codeup.codeupspringblog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdController {

//    private final AdRepository adDao;
//
//    public AdController(AdRepository adDao) {
//        this.adDao = adDao; // dependency injection
//    }
    @GetMapping("/ads")
    public String index(Model model) {

        return "ads/index";
    }
}
