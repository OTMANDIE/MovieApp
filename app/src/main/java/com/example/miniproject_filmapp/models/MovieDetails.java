package com.example.miniproject_filmapp.models;

public class MovieDetails {
    private String title;
    private String overview;
    private String releaseDate;
    public MovieDetails(String title, String overview, String releaseDate) {
        this.title = title;
        this.overview = overview;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
