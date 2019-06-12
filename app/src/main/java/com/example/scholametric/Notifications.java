package com.example.scholametric;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.scholametric.Adapters.NotificationsViewPagerAdapter;

public class Notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        ViewPager viewPager = findViewById(R.id.viewpager_notifications);

        NotificationsViewPagerAdapter adapter =  new NotificationsViewPagerAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs_notifications);
        tabLayout.setupWithViewPager(viewPager);
    }
}
