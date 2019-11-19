package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        //Loading image from below url into imageView
        Glide.with(this)
                .load("http://goo.gl/gEgYUd")
                .into(imageView);

    }
}
