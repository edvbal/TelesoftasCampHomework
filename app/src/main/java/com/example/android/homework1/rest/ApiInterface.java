package com.example.android.homework1.rest;

import com.example.android.homework1.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Edvinas on 22/06/2017.
 */

public interface ApiInterface {
    // @GET surasomi API parametrai kuriais buildins URL :?
    @GET("articles?source=techcrunch")
    Call<ArticleResponse> getStatusAndSource(@Query("apiKey") String apiKey);
}
