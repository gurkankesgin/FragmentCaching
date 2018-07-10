package com.pordiva.gurkan.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gurkan on 2.12.2015.
 */
public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /**
         *      scrollview de state i korumak için id tanımlamak gerekiyor.
         *      android:id="@+id/scrollView"
         */

        return inflater.inflate(R.layout.fragment1, container, false);
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("logwp","resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("logwp","pause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("logwp","destroy");
    }
}
