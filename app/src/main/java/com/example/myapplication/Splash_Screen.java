package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        VideoView video_View = findViewById(R.id.video_view);
        String videoPath = "Android.resource://"+getPackageName() + "/" + R.raw.file_name;
        Uri uri = Uri.parse(videoPath);
        video_View.setVideoURI(uri);
        video_View.start();
    }
}