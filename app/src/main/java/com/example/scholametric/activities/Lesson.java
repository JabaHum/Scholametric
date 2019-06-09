package com.example.scholametric.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.scholametric.R;

public class Lesson extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        Spinner spinner_class = findViewById(R.id.spinner_class);
        Spinner spinner_stream = findViewById(R.id.spinner_stream);
        Spinner spinner_subjects= findViewById(R.id.spinner_subject);

        ArrayAdapter<CharSequence> classAdapter = ArrayAdapter.createFromResource(this,
                R.array.Class_spinner,
                android.R.layout.simple_spinner_dropdown_item);
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_class.setAdapter(classAdapter);

        ArrayAdapter<CharSequence> streamAdapter = ArrayAdapter.createFromResource(this,
                R.array.Stream_spinner,
                android.R.layout.simple_spinner_dropdown_item);
        streamAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_stream.setAdapter(streamAdapter);

        ArrayAdapter<CharSequence> subjectsAdapter = ArrayAdapter.createFromResource(this,
                R.array.Subjects_spinner,
                android.R.layout.simple_spinner_dropdown_item);
        subjectsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_subjects.setAdapter(subjectsAdapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent.getId() == R.id.spinner_class)
        {
            //do this
            // toast to show what has been selected
            String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        }
        else if(parent.getId() == R.id.spinner_stream)
        {
            //do this
            // toast to show what has been selected
            String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        }else{
            // toast to show what has been selected
            String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
