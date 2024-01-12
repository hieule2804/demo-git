package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billing_id;
@ManyToOne
@JoinColumn(name = "subcription_id")
    private Subcription subcription_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
    @Column(name= "payment_method" ,nullable = false)
    private String payment_method;
    @Column(name= "total_amount" ,nullable = false)
    private int total_amount;
    @Column(name= "created_at" ,nullable = false)
    private LocalDateTime created_at;
    @Column(name= "is_trial" ,nullable = false)
    private boolean is_trial;

    public Billing() {
    }

    public int getBilling_id() {
        return billing_id;
    }

    public void setBilling_id(int billing_id) {
        this.billing_id = billing_id;
    }

    public Subcription getSubcription_id() {
        return subcription_id;
    }

    public void setSubcription_id(Subcription subcription_id) {
        this.subcription_id = subcription_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public boolean isIs_trial() {
        return is_trial;
    }

    public void setIs_trial(boolean is_trial) {
        this.is_trial = is_trial;
    }
}
