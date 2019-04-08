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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Datum> mDataset;

    public MyAdapter(List<Datum> myDataset){
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
            Datum datum = mDataset.get(position);

            String name = datum.getName();
            String shortDesc = datum.getStyle().getName();
            String desc = "Beer Description: " + datum.getDescription() + "\n\nCategory Description: " + datum.getStyle().getDescription();
            double abv;
            if (datum.getAbv() !=null){
                abv = Double.parseDouble(datum.getAbv());
            } else {abv = 0;}
            int ibuMin;
            int ibuMax;
            if (datum.getStyle().getIbuMin()!=null) {
                ibuMin = Integer.parseInt(datum.getStyle().getIbuMin());
            } else {ibuMin = 0;}
            if (datum.getStyle().getIbuMax()!=null){
                ibuMax = Integer.parseInt(datum.getStyle().getIbuMax());
            } else {ibuMax = 0;}
            int srmMin;
            int srmMax;
            if (datum.getStyle().getSrmMin()!=null){
                srmMin = Integer.parseInt(datum.getStyle().getSrmMin());
                srmMax = Integer.parseInt(datum.getStyle().getSrmMax());
            } else {
                srmMax = 0;
                srmMin = 0;
            }
            String brewery = datum.getName();

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
        holder.beerShortDesc.setText(mDataset.get(position).getStyle().getName());
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }


}
