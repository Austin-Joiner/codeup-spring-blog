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
        System.out.println(post.getUser().getEmail());
        model.addAttribute("post", post);
        return "posts/show";
    }
    @PostMapping("/posts/{id}")
    public String delete(@RequestParam long deleteId) {

            postDao.deleteById(deleteId);

        return "redirect:/posts";
    }

    @GetMapping("/posts/create")
    public String getCreate(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")

    public String postCreate(@ModelAttribute("post") Post post) {
        User user = userDao.getReferenceById(1L); // Retrieve the user with ID 1
        post.setUser(user);
        postDao.save(post);

        return "redirect:/posts";
    }


    @GetMapping("/posts/{id}/edit")
    public String getEdit(@PathVariable long id, Model model) {
        Optional<Post> idPostCheck = postDao.findById(id);

        if (idPostCheck.isPresent()) {
            Post post = idPostCheck.get();
            model.addAttribute("post", post);
            return "posts/edit";
        } else {
            return "redirect:/posts/error";
        }
    }

    @PostMapping("/posts/{id}/edit")
    public String postEdit(@ModelAttribute("post") Post post) {
        postDao.save(post);
        return "redirect:/posts";
    }




    @GetMapping("/posts/error")
    @ResponseBody
    public String errorMessage() {
        return "error: invalid ID";
    }




}
