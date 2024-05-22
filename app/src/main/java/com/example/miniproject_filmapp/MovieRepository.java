package com.example.miniproject_filmapp;

import androidx.lifecycle.LiveData;

import com.example.miniproject_filmapp.models.Movie;
import com.example.miniproject_filmapp.models.MovieDetails;

import java.util.List;

public class MovieRepository {
    private ApiService apiService;

    public MovieRepository() {
        apiService = RetrofitClient.getRetrofitInstance().create(ApiService.class);
    }

    public LiveData<List<Movie>> getPopularMovies(String apiKey) {
        return null;
    }

    public LiveData<MovieDetails> getMovieDetails(int movieId, String apiKey) {

        return null;
    }
}
