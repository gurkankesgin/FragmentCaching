package com.pordiva.gurkan.fragments.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.pordiva.gurkan.fragments.R;

public class FragmentWebView extends Fragment {

    private View view;
    private boolean isLoaded;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (isLoaded == false) {
            view = inflater.inflate(R.layout.fragment_webview, container, false);
            init(view);
            isLoaded = true;
        }

        return view;
    }

    private void init(View view) {
        WebView webview = view.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://developer.android.com/reference/android/webkit/WebView");
    }


}
