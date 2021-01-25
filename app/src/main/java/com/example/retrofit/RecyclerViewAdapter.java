package com.example.retrofit;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    List<PhotoModel> models;

    public RecyclerViewAdapter(List<PhotoModel> body) {
        this.models=body;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row,parent ,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
    holder.title.setText(models.get(position).getTvtitle());
    holder.title2.setText(models.get(position).getUrl());
    }
    
    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView title,title2;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            title2=itemView.findViewById(R.id.title2);
        }
    }
}
