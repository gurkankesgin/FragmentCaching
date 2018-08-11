package com.pordiva.gurkan.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.pordiva.gurkan.fragments.fragments.FragmentRecyclerView;
import com.pordiva.gurkan.fragments.fragments.FragmentScrollView;
import com.pordiva.gurkan.fragments.fragments.FragmentWebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOrReplaceFragment(new FragmentScrollView());
        setClick();
    }

    private void setClick() {
        ((BottomNavigationView) findViewById(R.id.main_bnw)).setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_scroll:
                                addOrReplaceFragment(new FragmentScrollView());
                                break;
                            case R.id.action_recycler:
                                addOrReplaceFragment(new FragmentRecyclerView());
                                break;
                            case R.id.action_webview:
                                addOrReplaceFragment(new FragmentWebView());
                                break;
                        }
                        return true;
                    }
                });
    }

    private void addOrReplaceFragment(Fragment currentFragment) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment newFragment = manager.findFragmentByTag(currentFragment.getClass().getName());


        if (newFragment == null) {
            transaction.replace(R.id.main_fl, currentFragment, currentFragment.getClass().getName());
        } else {
            transaction.replace(R.id.main_fl, newFragment);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }


}
