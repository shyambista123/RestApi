package com.example.restapi;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private Date dateCreated;
    private Date dateUpdated;

    public Post() {
    }

    public Post(long id, String title, String content, Date dateCreated, Date dateUpdated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        this.dateUpdated = dateUpdated;
    }
}
