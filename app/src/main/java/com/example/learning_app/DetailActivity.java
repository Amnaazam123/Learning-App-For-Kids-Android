package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView name1,name2,name3,name4,name5,name6,name7,name8,name9,name10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name1=findViewById(R.id.name1);
        name2=findViewById(R.id.name2);
        name3=findViewById(R.id.name3);
        name4=findViewById(R.id.name4);
        name5=findViewById(R.id.name5);
        name6=findViewById(R.id.name6);
        name7=findViewById(R.id.name7);
        name8=findViewById(R.id.name8);
        name9=findViewById(R.id.name9);
        name10=findViewById(R.id.name10);

        name1.setBackgroundColor(Color.parseColor("#E83845"));
        name2.setBackgroundColor(Color.parseColor("#FFFF00"));
        name3.setBackgroundColor(Color.parseColor("#FF9933"));
        name4.setBackgroundColor(Color.parseColor("#288BA8"));
        name5.setBackgroundColor(Color.parseColor("#66FF00"));
        name6.setBackgroundColor(Color.parseColor("#00FFFF"));
        name7.setBackgroundColor(Color.parseColor("#CCAC93"));
        name8.setBackgroundColor(Color.parseColor("#884DFF"));
        name9.setBackgroundColor(Color.parseColor("#E05194"));
        name10.setBackgroundColor(Color.parseColor("#96CE3B"));

        Intent intent = getIntent();
        name1.setText(intent.getStringExtra("name1"));
        name2.setText(intent.getStringExtra("name2"));
        name3.setText(intent.getStringExtra("name3"));
        name4.setText(intent.getStringExtra("name4"));
        name5.setText(intent.getStringExtra("name5"));
        name6.setText(intent.getStringExtra("name6"));
        name7.setText(intent.getStringExtra("name7"));
        name8.setText(intent.getStringExtra("name8"));
        name9.setText(intent.getStringExtra("name9"));
        name10.setText(intent.getStringExtra("name10"));
    }
}