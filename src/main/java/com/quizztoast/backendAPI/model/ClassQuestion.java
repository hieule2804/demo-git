package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class ClassQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int class_question_id;


@ManyToOne
@JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name="class_id")
    private java.lang.Class class_id;
    @Column(name= "content" ,nullable = false)

    private String content;
    @Column(name= "create_at" ,nullable = false)

    private LocalDateTime create_at;
    @Column(name= "is_answered" ,nullable = false)

    private boolean is_answered;

    public ClassQuestion() {
    }

    public int getClass_question_id() {
        return class_question_id;
    }

    public void setClass_question_id(int class_question_id) {
        this.class_question_id = class_question_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public java.lang.Class getClass_id() {
        return class_id;
    }

    public void setClass_id(java.lang.Class class_id) {
        this.class_id = class_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public boolean isIs_answered() {
        return is_answered;
    }

    public void setIs_answered(boolean is_answered) {
        this.is_answered = is_answered;
    }
}
