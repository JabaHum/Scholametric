package com.example.scholametric.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.scholametric.Adapters.CustomAdapter;
import com.example.scholametric.R;

import java.util.ArrayList;
import java.util.Arrays;

public class DashboardActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ArrayList myDataset = new ArrayList<>(Arrays.asList("Settings", "Report Cards", "Electives",
                "Sms", "Email", "Database",
                "Students","Staff","Logs",
                "Statistics","Schedules","Accommodation"));
        ArrayList myImages = new ArrayList<>(Arrays.asList(R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6,
                R.drawable.image7,
                R.drawable.image8,
                R.drawable.image9,
                R.drawable.image10,
                R.drawable.image11,
                R.drawable.image12
                ));


        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        RecyclerView.Adapter mAdapter = new CustomAdapter(myDataset, myImages);
        recyclerView.setAdapter(mAdapter);

    }
}
