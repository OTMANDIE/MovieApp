package com.example.miniproject_filmapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.miniproject_filmapp.MovieRepository;
import com.example.miniproject_filmapp.models.Movie;
import com.example.miniproject_filmapp.models.MovieDetails;

import java.util.List;

public class MovieViewModel extends ViewModel {
    private MovieRepository repository;

    public MovieViewModel() {
        repository = new MovieRepository();
    }

    public LiveData<List<Movie>> getPopularMovies(String apiKey) {
        return repository.getPopularMovies(apiKey);
    }

    public LiveData<MovieDetails> getMovieDetails(int movieId, String apiKey) {
        return repository.getMovieDetails(movieId, apiKey);
    }
}
