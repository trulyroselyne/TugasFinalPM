package com.example.tugasfinal.network;


import com.example.tugasfinal.models.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchApiInterface {
    @GET("movie")
    Call<MoviesResponse> getSearchResult(
            @Query("api_key") String apiKey,
            @Query("query") String query,
            @Query("page") int page
    );
}
