package com.example.k190224assignment4;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.k190224assignment4.Adapter.CatAPI;
import com.example.k190224assignment4.Adapter.CategoryAdapter;
import com.example.k190224assignment4.Adapter.CategoryListResponse;
import com.example.k190224assignment4.Adapter.PopAPI;
import com.example.k190224assignment4.Adapter.PopularAdapter;
import com.example.k190224assignment4.Adapter.PopularListResponse;
import com.example.k190224assignment4.Domain.CategoryDomain;
import com.example.k190224assignment4.Domain.PopularDomain;
import com.example.k190224assignment4.R;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private ArrayList<CategoryDomain> Categories = new ArrayList<>();
    private ArrayList<PopularDomain> Popular = new ArrayList<>();
    private RecyclerView catlist,poplist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerviewCategoryList();
        recyclerviewPopularList();
    }

    private void recyclerviewCategoryList() {
        CatAPI.getCatList().getCatList(new Callback<CategoryListResponse>() {

            @Override
            public void success(CategoryListResponse categoryListResponse, Response response) {
                Log.d("TAG", "Total Users: " + response.getBody());
                CategoryListResponse categories =  categoryListResponse;
                if (categories != null) {
                    Categories.addAll(categories.data);
                    adapter.notifyDataSetChanged();
                }
            }
            @Override
            public void failure(RetrofitError error) {
                Log.d("TAG","Response = "+error.toString());
            }

    });
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        catlist = findViewById(R.id.catlist);
        catlist.setLayoutManager(linearLayoutManager);

        adapter=new CategoryAdapter(Categories);
        catlist.setAdapter(adapter);
    }

    public void recyclerviewPopularList()
    {
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        poplist=findViewById(R.id.popularlist);
        poplist.setLayoutManager(linearLayoutManager);
        PopAPI.getPopList().getPopList(new Callback<PopularListResponse>() {

            @Override
            public void success(PopularListResponse popularListResponse, Response response) {
                Log.d("TAG", "Total Users: " + response.getBody());
                PopularListResponse popular =  popularListResponse;
                if (popular != null) {
                    Popular.addAll(popular.data);
                    adapter2.notifyDataSetChanged();
                }
            }
            @Override
            public void failure(RetrofitError error) {
                Log.d("TAG","Response = "+error.toString());
            }

        });
//        ArrayList<PopularDomain> popular = new ArrayList<>();
//        popular.add(new PopularDomain("Pepperoni Pizza","Slices pepperoni, mozzarella cheese, fresh olives, ground black pepper,pizza sauce","pop_1",9.76));
//        popular.add(new PopularDomain("Cheese Burger","Beef, Cheddar Cheese, Special Sauce, served with fresh Lettuce","pop_2",8.76));
//        popular.add(new PopularDomain("Vegetable Pizza","Vegetable Oil, Olive Oil, Mozzarella cheese, Pitted Kalamata, Cherry Tomatoes","pop_3",7.5));

        adapter2 = new PopularAdapter(Popular);
        poplist.setAdapter(adapter2);

    }

}