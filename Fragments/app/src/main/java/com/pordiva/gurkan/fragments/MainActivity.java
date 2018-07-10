package com.pordiva.gurkan.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOrReplaceFragment(new Fragment1());

        findViewById(R.id.buton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addOrReplaceFragment(new Fragment1());
            }
        });

        findViewById(R.id.buton2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addOrReplaceFragment(new Fragment2());


            }
        });
        findViewById(R.id.buton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                addOrReplaceFragment(new Fragment3());
            }
        });



    }

    private void addOrReplaceFragment(Fragment fragment) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment newFragment = manager.findFragmentByTag(fragment.getClass().getName());


        if (newFragment == null) {
            transaction.add(R.id.fragments, fragment, fragment.getClass().getName());
        } else {
            transaction.replace(R.id.fragments, newFragment);
        }

        transaction.addToBackStack(null);
        transaction.commit();
    }

}
