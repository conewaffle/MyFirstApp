package com.example.myfirstapp;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface BeerClient {
    @GET("beers/?key=0cafa2ad34d6df8c2e863a59c773394e&randomCount=20&order=random")
    Call<Example> getExample();

}
