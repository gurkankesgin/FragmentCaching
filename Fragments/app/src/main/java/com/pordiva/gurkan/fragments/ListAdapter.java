package com.pordiva.gurkan.fragments;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by gurkan on 6.1.2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {


    private String[] listItems;

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.textView.setText(listItems[position]);
    }

    public void addAll(String[] dataSet) {
        this.listItems = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        if (listItems != null)
            return listItems.length;
        else
            return 0;

    }
}
