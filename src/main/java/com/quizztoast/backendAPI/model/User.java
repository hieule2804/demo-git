package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int user_id;

    @Column(name= "google_id" ,nullable = false,unique = true)
    private int google_id;
    @Column(name= "username" ,nullable = false,unique = true)
    private String username;
    @Column(name= "password" ,nullable = false)
    private String password;
    @Column(name= "first_name" ,nullable = false)
    private String first_name;
    @Column(name= "last_name" ,nullable = false)
    private String last_name;
    @Column(name= "email" ,nullable = false,unique = true)
    private String email;
    @Column(name= "telephone" ,nullable = false,unique = true)
    private String telephone;
    @Column(name= "role" ,nullable = false)
    private String role;
    @Column(name= "is_banned" )
    private boolean is_banned;
    @Column(name= "is_premium" ,nullable = false)
    private boolean is_premium;
    @Column(name= "created_at" ,nullable = false)
    private LocalDateTime created_at;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGoogle_id() {
        return google_id;
    }

    public void setGoogle_id(int google_id) {
        this.google_id = google_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isIs_banned() {
        return is_banned;
    }

    public void setIs_banned(boolean is_banned) {
        this.is_banned = is_banned;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}

