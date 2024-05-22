package com.example.miniproject_filmapp.models;

public class Movie {
    private String title;
    private String poster;
    private double rating;

    public Movie(String title, String poster, double rating) {
        this.title = title;
        this.poster = poster;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
