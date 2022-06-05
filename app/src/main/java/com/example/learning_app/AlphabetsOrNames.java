package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlphabetsOrNames extends AppCompatActivity {

    Button learnabc;
    Button learnnames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_or_names);
        learnabc=findViewById(R.id.learnabc);
        learnnames=findViewById(R.id.learnnames);
        learnabc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlphabetsOrNames.this, Alphabets.class));

            }
        });
        learnnames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlphabetsOrNames.this, learnMoreNames.class));

            }
        });

    }
}