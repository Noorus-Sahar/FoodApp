package com.example.k190224assignment4.Interface;

import com.example.k190224assignment4.Adapter.CategoryListResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface CategoryAPI_Interface {
    @GET("/getcategory") public void getCatList(
            Callback<CategoryListResponse> callback);
}
