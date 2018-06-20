package com.example.yoshizawarei.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView itemString;
    public MyRecyclerViewHolder(View itemView) {
        super(itemView);
        itemString = itemView.findViewById(R.id.itemString);
    }

    public void onBind(String item) {
        itemString.setText(item);
    }
}
