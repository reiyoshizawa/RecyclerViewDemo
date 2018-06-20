package com.example.yoshizawarei.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {

    private String[] programming ={"C/C++", "Python", "Java", "Swift", "JavaScript", "C#"};

    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_view_holder, parent, false);

        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        if (holder != null) {
            holder.onBind(programming[position]);
        }
    }

    @Override
    public int getItemCount() {
        return programming.length;

    }
}
