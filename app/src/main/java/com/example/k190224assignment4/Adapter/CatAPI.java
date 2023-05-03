package com.example.k190224assignment4.Adapter;

import com.example.k190224assignment4.Interface.CategoryAPI_Interface;

import retrofit.RestAdapter;

public class CatAPI {

    public static CategoryAPI_Interface getCatList()
    {
        String remoteHost = "https://283a-39-51-2-136.ngrok-free.app";
        String localHost = "http://127.0.0.1:5000 ";
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(remoteHost) .build();
        CategoryAPI_Interface api = adapter.create(CategoryAPI_Interface.class);
        return api; // return the APIInterface object
    }
}