package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setTitle("Beers");

        ArrayList<Beer> myDataset = Beer.getDummyBeers();

        mAdapter = new MyAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);


    }

    //public void launchDetailActivity(View view) {
        //Intent intent = new Intent(this, DisplayDetailActivity.class);
        //startActivity(intent);
    //}

}
