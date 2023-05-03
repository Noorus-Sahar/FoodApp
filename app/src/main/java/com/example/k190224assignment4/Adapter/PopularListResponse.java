package com.example.k190224assignment4.Adapter;

import com.example.k190224assignment4.Domain.CategoryDomain;
import com.example.k190224assignment4.Domain.PopularDomain;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class PopularListResponse {
    @SerializedName("PopularList")
    public List<PopularDomain> data = new ArrayList<>();
}
