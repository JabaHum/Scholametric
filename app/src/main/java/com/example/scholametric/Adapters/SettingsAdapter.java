package com.example.scholametric.Adapters;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.scholametric.R;

import java.util.ArrayList;

public class SettingsAdapter  extends RecyclerView.Adapter{
    private ArrayList mData;
    private ArrayList mImages;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // infalte the item Layout
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rowlayout, viewGroup, false);
        return new MyViewHolder(v);
    }

    public SettingsAdapter(ArrayList mData, ArrayList mImages) {
        this.mData = mData;
        this.mImages = mImages;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        MyViewHolder.textView.setText((String) mData.get(i));
        MyViewHolder.imageView.setImageResource((Integer) mImages.get(i));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        @SuppressLint("StaticFieldLeak")
        static TextView textView;
        @SuppressLint("StaticFieldLeak")
        static ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.cardName);
            imageView = itemView.findViewById(R.id.cardImage);
        }
    }
}
