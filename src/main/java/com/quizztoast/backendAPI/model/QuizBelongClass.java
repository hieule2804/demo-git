package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class QuizBelongClass {

    @EmbeddedId
    private QuizBeLongClassId id;

    // Constructors, getters, setters, etc.
    @Embeddable
    public class QuizBeLongClassId implements Serializable {

        @ManyToOne
        @JoinColumn(name = "exam_id")
        private Exam exam_id;

        @ManyToOne
        @JoinColumn(name = "class_id")
        private Class class_id;

        // Constructors, getters, setters, etc.
    }

}