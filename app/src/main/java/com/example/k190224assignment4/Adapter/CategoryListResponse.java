package com.example.k190224assignment4.Adapter;

import com.example.k190224assignment4.Domain.CategoryDomain;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CategoryListResponse {
    @SerializedName("CategoryList")
    public List<CategoryDomain> data = new ArrayList<>();
}
