package com.example.k190224assignment4.Adapter;

import com.example.k190224assignment4.Interface.CategoryAPI_Interface;
import com.example.k190224assignment4.Interface.PopularAPI_Interface;

import retrofit.RestAdapter;

public class PopAPI {
    public static PopularAPI_Interface getPopList()
    {
        String remoteHost = "https://283a-39-51-2-136.ngrok-free.app";
        String localHost = "http://127.0.0.1:5000 ";
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(remoteHost) .build();
        PopularAPI_Interface api = adapter.create(PopularAPI_Interface.class);
        return  api; // return the APIInterface object
    }
}
