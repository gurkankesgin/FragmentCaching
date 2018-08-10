package com.pordiva.gurkan.fragments.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pordiva.gurkan.fragments.R;

/**
 * Created by gurkan on 2.12.2015.
 */
public class FragmentScrollView extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /**
         *      scrollview de state i korumak için id tanımlamak gerekiyor.
         *      android:id="@+id/scrollView"
         *      appbar ın yok olması için nestedscrollview olmalı
         */

        if (view == null)
            view = inflater.inflate(R.layout.fragment_scroll, container, false);


        return view;
    }


}
