package com.example.scholametric;

        import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.scholametric.Adapters.ExamViewPagerAdapter;

public class Exams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);
        ViewPager viewPager = findViewById(R.id.viewpager_exams);

        ExamViewPagerAdapter adapter =  new ExamViewPagerAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.sliding_tabs_exams);
        tabLayout.setupWithViewPager(viewPager);
    }
}
