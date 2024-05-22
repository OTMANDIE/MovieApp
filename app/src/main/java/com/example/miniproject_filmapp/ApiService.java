package com.example.miniproject_filmapp;

import com.example.miniproject_filmapp.models.Movie;
import com.example.miniproject_filmapp.models.MovieDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("movie/popular")
    Call<Movie> getPopularMovies(@Query("f23e80a2596bde17101e0a1558818654") String apiKey);

    @GET("movie/{movie_id}")
    Call<MovieDetails> getMovieDetails(@Path("movie_id") int movieId, @Query("f23e80a2596bde17101e0a1558818654") String apiKey);
}
