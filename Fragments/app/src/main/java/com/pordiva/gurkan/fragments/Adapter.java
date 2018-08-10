package com.pordiva.gurkan.fragments;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by gurkan on 6.1.2016.
 */
public class Adapter extends RecyclerView.Adapter<ViewHolder> {


    private String[] dataSet;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(dataSet[position]);
    }

    public void addAll(String[] dataSet) {
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        if (dataSet != null)
            return dataSet.length;
        else
            return 0;

    }
}
