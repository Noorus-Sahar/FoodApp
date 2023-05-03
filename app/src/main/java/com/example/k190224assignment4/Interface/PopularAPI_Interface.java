package com.example.k190224assignment4.Interface;

import com.example.k190224assignment4.Adapter.CategoryListResponse;
import com.example.k190224assignment4.Adapter.PopularListResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface PopularAPI_Interface {
    @GET("/getpopularlist") public void getPopList(
            Callback<PopularListResponse> callback);
}
