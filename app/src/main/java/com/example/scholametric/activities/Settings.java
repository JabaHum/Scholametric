package com.example.scholametric.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.scholametric.Adapters.SettingsAdapter;
import com.example.scholametric.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ArrayList myData = new ArrayList<>(Arrays.asList("General Info", "DB Backup", "Permissions",
                "Assign Class", "Dormitory", "Notifications",
                "Exams","Extra-curricular","Finances",
                "Health","Subjects","Set Calender"));
        ArrayList myImages = new ArrayList<>(Arrays.asList(R.drawable.image1,
                R.drawable.image6,
                R.drawable.image19,
                R.drawable.image17,
                R.drawable.image12,
                R.drawable.image13,
                R.drawable.image23,
                R.drawable.image20,
                R.drawable.image18,
                R.drawable.image16,
                R.drawable.image15,
                R.drawable.image14
        ));

        RecyclerView recyclerView = findViewById(R.id.recycler_view_settings);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter
        RecyclerView.Adapter mAdapter = new SettingsAdapter(myData, myImages);
        recyclerView.setAdapter(mAdapter);
    }
}
