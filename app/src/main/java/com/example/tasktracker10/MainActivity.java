package com.example.tasktracker10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;



public class MainActivity extends AppCompatActivity {


    TextView dateTextView;

    public void updateDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM d");
        LocalDateTime now = LocalDateTime.now();

        dateTextView.setText(dtf.format(now));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateTextView = (TextView)findViewById(R.id.dateTextView);
        updateDate();

    }
}