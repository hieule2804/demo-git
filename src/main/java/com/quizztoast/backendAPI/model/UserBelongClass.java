package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table
public class UserBelongClass {

    @EmbeddedId
    private UserBelongClassId id;

    // Constructors, getters, setters, etc.
    @Embeddable
    public class UserBelongClassId implements Serializable {

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne
        @JoinColumn(name = "class_id")
        private java.lang.Class classEntity;

        // Constructors, getters, setters, etc.
    }

}