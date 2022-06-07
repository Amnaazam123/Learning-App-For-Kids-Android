package com.example.learning_app;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class imageDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        Bundle extras = getIntent().getExtras();
        int res = extras.getInt("resourseInt");
        ImageView img = (ImageView) findViewById(R.id.output);
        img.setImageResource(res);
    }
}