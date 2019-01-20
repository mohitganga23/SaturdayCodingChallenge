package com.example.android.saturdaycodingchallenge;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.imageView);

        int SPLASH_SCREEN_TIME_OUT = 4000;


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SelectionActivity.class);
                Pair pair = new Pair<View, String>(mImageView, "imageTransition");
                ActivityOptions option = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pair);
                startActivity(intent, option.toBundle());
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
