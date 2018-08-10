package com.pordiva.gurkan.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by gurkan on 6.1.2016.
 */
public class ListViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;


    public ListViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.titleTv);
    }


}