package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

@Entity
@Table
public class Image {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int image_id;
    @OneToOne
    @JoinColumn(name = "user_id")
private User source_id;

private String webp_img;

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public User getSource_id() {
        return source_id;
    }

    public void setSource_id(User source_id) {
        this.source_id = source_id;
    }

    public String getWebp_img() {
        return webp_img;
    }

    public void setWebp_img(String webp_img) {
        this.webp_img = webp_img;
    }
}
