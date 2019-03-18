package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_detail);

       // ArrayList<Beer> beer = Beer.getDummyBeers();
        //Beer beer2 = beer.get(0);
        Intent intent = getIntent();

        TextView textTitle = findViewById(R.id.textTitle);
        TextView textShort = findViewById(R.id.textShort);
        TextView textDesc = findViewById(R.id.textDesc);
        TextView ibu = findViewById(R.id.ibu);
        TextView srm = findViewById(R.id.srm);
        TextView abv = findViewById(R.id.abv);
        TextView brewery = findViewById(R.id.brewery);

        textDesc.setMovementMethod(new ScrollingMovementMethod());
        textTitle.setMovementMethod(new ScrollingMovementMethod());

        setTitle(intent.getStringExtra("NAME"));

        textTitle.setText(intent.getStringExtra("NAME"));
        textShort.setText(intent.getStringExtra("SHORTDESC"));
        textDesc.setText(intent.getStringExtra("DESC"));
        ibu.setText("IBU: " + intent.getIntExtra("IBUMIN", 0) + " - " + intent.getIntExtra("IBUMAX", 99));
        srm.setText("SRM: " + intent.getIntExtra("SRMMIN", 0) + " - " + intent.getIntExtra("SRMMAX", 99));
        brewery.setText(intent.getStringExtra("BREWERY"));
        String abv2 = Double.toString(intent.getDoubleExtra("ABV", 0));
        abv.setText(abv2 + "%");

    }

    public void search(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.google.com.au"));
        startActivity(i);

    }
}
