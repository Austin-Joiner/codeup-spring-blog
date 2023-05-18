package com.codeup.codeupspringblog.controllers;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String get(Model model) {
        model.addAttribute("title", "posts");
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getId(Model model) {
        model.addAttribute("title", "posts-ID");
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreate(Model model) {
        model.addAttribute("title", "posts-create");
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreate(Model model) {
        model.addAttribute("title", "posts-create");
        return "create a new post";
    }

}
