package com.pordiva.gurkan.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gurkan on 2.12.2015.
 */
public class Fragment2 extends Fragment {


    private String[] items = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"};

    private Adapter mAdapter;
    private View view ;
    private boolean isLoaded;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment2, container, false);
            init(view);
            isLoaded = true;
        }

        return view;
    }

    private void init(View view) {
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new Adapter();
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addAll(items);
    }


}
