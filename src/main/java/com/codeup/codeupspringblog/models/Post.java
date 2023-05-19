package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
public class Post {


    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String body;

    @OneToOne
    private User post;

    public Post(Long id, String title, String body, User post) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.post = post;
    }

    public Post(long id, String title, String deleteBody) {
        this.title = title;
    }

    public Post(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Post(String title, String body, Long id) {
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post() {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getPost() {
        return post;
    }

    public void setPost(User post) {
        this.post = post;
    }
}
