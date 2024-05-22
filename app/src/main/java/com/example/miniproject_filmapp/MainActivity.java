package com.example.miniproject_filmapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.miniproject_filmapp.viewmodel.MovieViewModel;

public class MainActivity extends AppCompatActivity {
    private MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        MovieAdapter adapter = new MovieAdapter();
        recyclerView.setAdapter(adapter);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        String apiKey = "https://api.themoviedb.org/3/movie/550?api_key=f23e80a2596bde17101e0a1558818654";

        movieViewModel.getPopularMovies(apiKey).observe(this, movies -> {

            adapter.setMovies(movies);
        });
    }
}