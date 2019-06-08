package com.example.scholametric.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.scholametric.R;

public class Schedules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);

        Button lesson_btn = findViewById(R.id.lesson_tt_btn);
        Button exam_btn = findViewById(R.id.exam_tt_btn);
        Button events = findViewById(R.id.events_btn);

        lesson_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lesson = new Intent(Schedules.this,Lesson.class);
                startActivity(lesson);
            }
        });
        exam_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exam = new Intent(Schedules.this,Exam.class);
                startActivity(exam);
            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent events = new Intent(Schedules.this,Events.class);
                startActivity(events);
            }
        });
    }


}
