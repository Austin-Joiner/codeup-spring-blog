package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


@Controller
public class PostController {

    @GetMapping("/posts")

    public String get(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        Post postOne = new Post("Title One, BODY ONE");
        Post postTwo = new Post("Title Two, BODY TWO");

        posts.add(postOne);
        posts.add(postTwo);

        model.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
//    @ResponseBody
    public String getId(@PathVariable int id, Model model) {
        Post post = new Post("post", "This is a individual post");
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreate() {

        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreate() {

        return "create a new post";
    }
}
