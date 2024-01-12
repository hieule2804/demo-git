package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

@Entity
@Table
public class Subcription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subcription_id ;
    @Column(name= "subcription_name" ,nullable = false)
    private String subcription_name;
    @Column(name= "duration" ,nullable = false)
    private int duration;
    @Column(name= "amount" ,nullable = false)
    private int amount;

    public int getSubcription_id() {
        return subcription_id;
    }

    public void setSubcription_id(int subcription_id) {
        this.subcription_id = subcription_id;
    }

    public String getSubcription_name() {
        return subcription_name;
    }

    public void setSubcription_name(String subcription_name) {
        this.subcription_name = subcription_name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
