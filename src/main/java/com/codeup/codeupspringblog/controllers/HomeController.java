package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
public class HomeController {




    @GetMapping("/")
    @ResponseBody
    public String landing(Model model) {
        model.addAttribute("title", "Home");
        return "This is the landing page!";
    }
}
