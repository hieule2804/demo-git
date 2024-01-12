package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

@Entity
@Table
public class ClassAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int class_answer_id ;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @OneToOne
    @JoinColumn(name = "class_question_id")
    private ClassQuestion class_question_id;
    @Column(name= "content" ,nullable = false)

    private String content;

    public ClassAnswer() {
    }

    public int getClass_answer_id() {
        return class_answer_id;
    }

    public void setClass_answer_id(int class_answer_id) {
        this.class_answer_id = class_answer_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public ClassQuestion getClass_question_id() {
        return class_question_id;
    }

    public void setClass_question_id(ClassQuestion class_question_id) {
        this.class_question_id = class_question_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
