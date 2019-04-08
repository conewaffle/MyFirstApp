package com.example.myfirstapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    public int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setTitle("Beers");

        //ArrayList<Beer> myDataset = Beer.getDummyBeers();

        GetBeersClass myBeerClass = new GetBeersClass();
        myBeerClass.execute();

    }

    private class GetBeersClass extends AsyncTask<Void, Void, List<Datum>> {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://sandbox-api.brewerydb.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        BeerClient client = retrofit.create(BeerClient.class);

        @Override
        protected List<Datum> doInBackground(Void... voids) {
            Call<Example> beerCall = client.getExample();

            try {
                Response<Example> beerResponse = beerCall.execute();
                List<Datum> myList = beerResponse.body().getData();
                return myList;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(List<Datum> result){
            mAdapter = new MyAdapter(result);
            recyclerView.setAdapter(mAdapter);
        }
    }


}
