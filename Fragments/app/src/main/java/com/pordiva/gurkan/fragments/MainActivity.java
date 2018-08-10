package com.pordiva.gurkan.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOrReplaceFragment(new Fragment1());


        ((TabLayout) findViewById(R.id.tabs)).setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                if (position == 0) {
                    addOrReplaceFragment(new Fragment1());
                }
                if (position == 1) {
                    addOrReplaceFragment(new Fragment2());
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void addOrReplaceFragment(Fragment currentFragment) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment newFragment = manager.findFragmentByTag(currentFragment.getClass().getName());


        if (newFragment == null) {

            transaction.replace(R.id.fragments, currentFragment, currentFragment.getClass().getName());
        } else {
            transaction.replace(R.id.fragments, newFragment);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }



}
