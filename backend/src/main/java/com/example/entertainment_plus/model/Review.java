package com.example.entertainment_plus.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_review")
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int rating;
    private String comment;

    private LocalDate reviewDate;
    @PrePersist
    public void prePersist() {
        this.reviewDate = LocalDate.now();
    }

    private LocalDate watchedDate;

    public Review(){}

    public Review(String title, int rating, String comment, LocalDate watchedDate){
        this.title = title;
        this.rating = rating;
        this.comment = comment;
        this.watchedDate = watchedDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public LocalDate getWatchedDate() { return watchedDate; }
    public void setWatchedDate(LocalDate watchedDate) { this.watchedDate = watchedDate; }
    public LocalDate getReviewDate() { return reviewDate; }

}
