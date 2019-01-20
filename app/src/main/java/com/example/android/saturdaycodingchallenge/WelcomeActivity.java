package com.example.android.saturdaycodingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class
WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView welcomeText = findViewById(R.id.welcomeText);

        String passedUsername;

        Intent i = getIntent();
        passedUsername = i.getStringExtra("key");

        String updatedText = "Welcome," + passedUsername;

        welcomeText.setText(updatedText);

    }
}
