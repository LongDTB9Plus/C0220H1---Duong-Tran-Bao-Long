package com.springboot.models;


import javax.persistence.*;
import java.util.Date;

@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private java.sql.Date date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "blog_category_id")
    private BlogCategory blogCategory;

    public BlogPost() {

    }

    public BlogPost(Integer id, String title, String author, java.sql.Date date, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BlogCategory getBlogCategory() {

        return blogCategory;
    }

    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }
}
