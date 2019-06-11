package com.example.scholametric;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.scholametric.Adapters.ViewPagerAdaper;

public class GeneralInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);

        ViewPager viewPager = findViewById(R.id.viewpager_general_info);

        ViewPagerAdaper adapter =  new ViewPagerAdaper(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs_general_info);
        tabLayout.setupWithViewPager(viewPager);
    }
}
