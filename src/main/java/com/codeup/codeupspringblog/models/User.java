//package com.codeup.codeupspringblog.models;
//
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
//
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @Column(name = "userName", nullable = false)
//    private String userName;
//
//    public User(String userName) {
//        this.userName = userName;
//    }
//
//    public User(Long id, String userName) {
//        this.id = id;
//        this.userName = userName;
//    }
//
//    public User() {
//
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//}
