package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Class {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int class_id;

  @Column(name= "user_id" ,nullable = false)
  private int user_id;
  @Column(name= "class_name" ,nullable = false)
  private String class_name;
  @Column(name= "slug_code" ,nullable = false,unique = true)
  private String slug_code;
  @Column(name= "created_at" ,nullable = false)
  private LocalDateTime created_at;

  public Class() {
  }

  public int getClass_id() {
    return class_id;
  }

  public void setClass_id(int class_id) {
    this.class_id = class_id;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getClass_name() {
    return class_name;
  }

  public void setClass_name(String class_name) {
    this.class_name = class_name;
  }

  public String getSlug_code() {
    return slug_code;
  }

  public void setSlug_code(String slug_code) {
    this.slug_code = slug_code;
  }

  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
  }
}
