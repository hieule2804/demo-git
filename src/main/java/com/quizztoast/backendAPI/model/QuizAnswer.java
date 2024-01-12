package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class QuizAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int quiz_answer_id;
    @ManyToOne
    @JoinColumn(name = "quiz_question_id")
    private QuizQuestion quiz_question_id;
    @Column(name= "content" ,nullable = false)

    private String content;
    @Column(name= "is_correct" ,nullable = false)

    private Boolean is_correct;
    @Column(name= "created_at" ,nullable = false)

    private LocalDateTime created_at;

    public int getQuiz_answer_id() {
        return quiz_answer_id;
    }

    public void setQuiz_answer_id(int quiz_answer_id) {
        this.quiz_answer_id = quiz_answer_id;
    }

    public QuizQuestion getQuiz_question_id() {
        return quiz_question_id;
    }

    public void setQuiz_question_id(QuizQuestion quiz_question_id) {
        this.quiz_question_id = quiz_question_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIs_correct() {
        return is_correct;
    }

    public void setIs_correct(Boolean is_correct) {
        this.is_correct = is_correct;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
