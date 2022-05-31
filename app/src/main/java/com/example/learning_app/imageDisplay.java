package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class imageDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        Bundle extras = getIntent().getExtras();
        int res = extras.getInt("resourseInt");
        ImageView img = (ImageView) findViewById(R.id.output);
        Intent intent = getIntent();
        img.setImageResource(res);
    }
}