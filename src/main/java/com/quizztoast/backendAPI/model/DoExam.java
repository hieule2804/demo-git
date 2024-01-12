package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class DoExam {

    @EmbeddedId
    private DoExamId id;

    // Constructors, getters, setters, etc.
    @Embeddable
    public class DoExamId implements Serializable {

        @ManyToOne
        @JoinColumn(name = "exam_id")
        private Exam exam_id;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user_id;

        // Constructors, getters, setters, etc.
    }

}