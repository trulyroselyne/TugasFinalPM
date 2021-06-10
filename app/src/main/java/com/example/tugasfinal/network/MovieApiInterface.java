package com.example.tugasfinal.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.example.tugasfinal.models.CastResponse;
import com.example.tugasfinal.models.MoviesResponse;
import com.example.tugasfinal.models.movie.Movie;


public interface MovieApiInterface {
    @GET("now_playing")
    Call<MoviesResponse> getNowPlaying(
            @Query("api_key") String apiKey,
            @Query("page") int page
    );

    @GET("{movie_id}")
    Call<Movie> getMovie(
            @Path("movie_id") String id,
            @Query("api_key") String apiKey
    );

    @GET("{movie_id}/credits")
    Call<CastResponse> getCast(
            @Path("movie_id") String id,
            @Query("api_key") String apiKey
    );

    @GET("upcoming")
    Call<MoviesResponse> getUpcoming(
            @Query("api_key") String apiKey,
            @Query("page") int page
    );

    @GET("popular")
    Call<MoviesResponse> getPopular(
            @Query("api_key") String apiKey,
            @Query("page") int page
    );
}
