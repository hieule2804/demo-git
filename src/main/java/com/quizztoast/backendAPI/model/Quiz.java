package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Quiz {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quiz_id;
@ManyToOne
@JoinColumn(name = "user_id")
    private User user_id;
    private int class_id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;
    @Column(name= "quiz_name" ,nullable = false)

    private String quiz_name;
    @Column(name= "rate" ,nullable = false)

    private int rate;
    @Column(name= "created_at" ,nullable = false)

    private LocalDateTime created_at;
    @Column(name= "quiz_ques_id" ,nullable = false)

    private int quiz_ques_id;

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public String getQuiz_name() {
        return quiz_name;
    }

    public void setQuiz_name(String quiz_name) {
        this.quiz_name = quiz_name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public int getQuiz_ques_id() {
        return quiz_ques_id;
    }

    public void setQuiz_ques_id(int quiz_ques_id) {
        this.quiz_ques_id = quiz_ques_id;
    }
}
