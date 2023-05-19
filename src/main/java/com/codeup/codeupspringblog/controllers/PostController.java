package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Post;
import com.codeup.codeupspringblog.models.User;
import com.codeup.codeupspringblog.repositories.PostRepository;
import com.codeup.codeupspringblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class PostController {


        private final PostRepository postDao;


        private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao; // dependency injection
        this.userDao = userDao;
    }

    //    Post findByTitle(String title);
//    Post findByDescriptionContaining(String search);


    @GetMapping("/posts")

    public String get(Model model) {
        List<Post> posts = postDao.findAll();



        model.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getId(@PathVariable long id, Model model) {
        Post post = postDao.getReferenceById(id);
        model.addAttribute("post", post);
        return "posts/show";
    }
    @PostMapping("/posts/{id}")
    public String delete(@RequestParam long deleteId) {

            postDao.deleteById(deleteId);

        return "redirect:/posts";
    }

    @GetMapping("/posts/create")
    public String getCreate() {
        return "posts/create";
    }

    @PostMapping("/posts/create")

    public String postCreate(@RequestParam String title, @RequestParam String body) {
        Post post = new Post(title, body);

        User user = userDao.findById(1L).orElse(null); // Retrieve the user with ID 1

        if (user != null) {
            post.setUser(user); // Assign the user to the post
            postDao.save(post); // Save the post with the assigned user
        }

        return "redirect:/posts";
    }





}
