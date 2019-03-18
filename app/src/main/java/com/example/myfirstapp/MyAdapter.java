package com.example.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<Beer> mDataset;

    public MyAdapter(ArrayList<Beer> myDataset){
        mDataset = myDataset;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView beerName;
        public TextView beerShortDesc;
        public Button buttonTo;

        public MyViewHolder(View itemView){
            super(itemView);
            beerName = itemView.findViewById(R.id.beerName);
            beerShortDesc = itemView.findViewById(R.id.beerShort);
            buttonTo = itemView.findViewById(R.id.buttonLaunch);

            buttonTo.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Beer beer = mDataset.get(position);

            String name = beer.getName();
            String shortDesc = beer.getShortDescription();
            String desc = beer.getDescription();
            double abv = beer.getAbv();
            int ibuMin = beer.getIbuMin();
            int ibuMax = beer.getIbuMax();
            int srmMin = beer.getSrmMin();
            int srmMax = beer.getSrmMax();
            String brewery = beer.getBrewery();

            Intent intent = new Intent(itemView.getContext(), DisplayDetailActivity.class);

            intent.putExtra("NAME", name);
            intent.putExtra("SHORTDESC", shortDesc);
            intent.putExtra("DESC",desc);
            intent.putExtra("ABV", abv);
            intent.putExtra("IBUMIN",ibuMin);
            intent.putExtra("IBUMAX",ibuMax);
            intent.putExtra("SRMMIN",srmMin);
            intent.putExtra("SRMMAX", srmMax);
            intent.putExtra("BREWERY", brewery);

            itemView.getContext().startActivity(intent);
        }


    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View beerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        MyViewHolder vh = new MyViewHolder(beerView);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.beerName.setText(mDataset.get(position).getName());
        holder.beerShortDesc.setText(mDataset.get(position).getShortDescription());
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }


}
