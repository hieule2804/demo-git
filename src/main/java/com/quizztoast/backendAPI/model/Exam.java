package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private int exam_id;
    @ManyToOne
    @JoinColumn(name = "quiz_id")
   private Quiz quiz_id;

    @Column(name= "user_id" ,nullable = false)

    private int user_id;
    @Column(name= "craeted_id" ,nullable = false)

    private LocalDateTime craeted_id;
    @Column(name= "state" ,nullable = false)

    private String state;

    public Exam() {
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public Quiz getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(Quiz quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getCraeted_id() {
        return craeted_id;
    }

    public void setCraeted_id(LocalDateTime craeted_id) {
        this.craeted_id = craeted_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
