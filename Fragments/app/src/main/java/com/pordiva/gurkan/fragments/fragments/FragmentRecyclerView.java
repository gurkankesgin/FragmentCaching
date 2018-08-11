package com.pordiva.gurkan.fragments.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pordiva.gurkan.fragments.adapter.ItemAdapter;
import com.pordiva.gurkan.fragments.R;

public class FragmentRecyclerView extends Fragment {


    private String[] listItems = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s"};

    private ItemAdapter mAdapter;
    private View view ;
    private boolean isLoaded;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_recycler, container, false);
            init(view);
            isLoaded = true;
        }

        return view;
    }

    private void init(View view) {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.listRv);

        mAdapter = new ItemAdapter();

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.addAll(listItems);
    }


}
