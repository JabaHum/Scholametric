package com.example.scholametric;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.scholametric.Adapters.FinancesViewPagerAdapter;

public class Finances extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finances);


        ViewPager viewPager = findViewById(R.id.viewpager_finances);

        FinancesViewPagerAdapter adapter =  new FinancesViewPagerAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs_finances);
        tabLayout.setupWithViewPager(viewPager);

    }
}
