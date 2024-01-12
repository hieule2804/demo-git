package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int quiz_question_id;
    @Column(name= "created_at" ,nullable = false)

    private LocalDateTime created_at;
    @Column(name= "content" ,nullable = false)

    private String content;

    public int getQuiz_question_id() {
        return quiz_question_id;
    }

    public void setQuiz_question_id(int quiz_question_id) {
        this.quiz_question_id = quiz_question_id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
