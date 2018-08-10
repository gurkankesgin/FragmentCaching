package com.pordiva.gurkan.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import com.pordiva.gurkan.fragments.fragments.FragmentRecyclerView;
import com.pordiva.gurkan.fragments.fragments.FragmentScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOrReplaceFragment(new FragmentScrollView());


        ((TabLayout) findViewById(R.id.tabs)).setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                if (position == 0) {
                    addOrReplaceFragment(new FragmentScrollView());
                }
                if (position == 1) {
                    addOrReplaceFragment(new FragmentRecyclerView());
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

            transaction.replace(R.id.fragmentsFl, currentFragment, currentFragment.getClass().getName());
        } else {
            transaction.replace(R.id.fragmentsFl, newFragment);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }



}
