package com.quizztoast.backendAPI.model;

import jakarta.persistence.*;

@Entity
@Table
public class Maeketing {
    @Id
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image Marketing_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;
    @Column(name= "content" ,nullable = false)

    private String content;
    @Column(name= "embed_link" ,nullable = false)

    private String embed_link;

    public Image getMarketing_id() {
        return Marketing_id;
    }

    public void setMarketing_id(Image marketing_id) {
        Marketing_id = marketing_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmbed_link() {
        return embed_link;
    }

    public void setEmbed_link(String embed_link) {
        this.embed_link = embed_link;
    }
}
