package com.pordiva.gurkan.fragments.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pordiva.gurkan.fragments.R;


public class FragmentScrollView extends Fragment {

    private View view;
    private boolean isLoaded;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_scroll, container, false);
            isLoaded = true;
        }

        return view;
    }


}
