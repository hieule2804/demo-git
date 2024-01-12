package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;

    //    @Column(name= "user_id" ,nullable = false)
//    private int user_id;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name="class_question_id")
    private ClassQuestion class_question_id;
    @Column(name= "content" ,nullable = false)
    private String content;

    public Comment() {
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
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