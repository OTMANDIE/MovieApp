package com.example.miniproject_filmapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.miniproject_filmapp.viewmodel.MovieViewModel;

public class MovieDetailActivity extends AppCompatActivity {
    private MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        int movieId = getIntent().getIntExtra("MOVIE_ID", 0);
        String apiKey = "https://api.themoviedb.org/3/movie/550?api_key=f23e80a2596bde17101e0a1558818654";

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);

        movieViewModel.getMovieDetails(movieId, apiKey).observe(this, movieDetails -> {

        });
    }
}