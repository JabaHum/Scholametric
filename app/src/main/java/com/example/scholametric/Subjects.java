package com.example.scholametric;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.scholametric.Adapters.SubjectsViewPagerAdapter;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        ViewPager viewPager = findViewById(R.id.viewpager_subjects);

        SubjectsViewPagerAdapter adapter =  new SubjectsViewPagerAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs_subjects);
        tabLayout.setupWithViewPager(viewPager);

    }
}
