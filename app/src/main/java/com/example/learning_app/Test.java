package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity implements View.OnClickListener{

    Button q1,q2,q3,q4,q5,q6,q7,q8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        q1=findViewById(R.id.q1);
        q2=findViewById(R.id.q2);
        q3=findViewById(R.id.q3);
        q4=findViewById(R.id.q4);
        q5=findViewById(R.id.q5);
        q6=findViewById(R.id.q6);
        q7=findViewById(R.id.q7);
        q8=findViewById(R.id.q8);

        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(Test.this, QuestionDisplay.class);
        switch(v.getId()){
            case R.id.q1:
                intent.putExtra("Question", "1");
                intent.putExtra("resourseInt", R.drawable.letter_a);
                intent.putExtra("option1", "Apple");
                intent.putExtra("option2", "Lion");
                intent.putExtra("option3", "Orange");
                startActivity(intent);
                break;
            case R.id.q2:
                intent.putExtra("Question", "2");
                intent.putExtra("resourseInt", R.drawable.letter_o);
                intent.putExtra("option1", "Umbrella");
                intent.putExtra("option2", "Onion");
                intent.putExtra("option3", "Ali");
                startActivity(intent);
                break;
            case R.id.q3:
                intent.putExtra("Question", "3");
                intent.putExtra("resourseInt", R.drawable.letter_z);
                intent.putExtra("option1", "Apple");
                intent.putExtra("option2", "Lion");
                intent.putExtra("option3", "Zebra");
                startActivity(intent);
                break;
            case R.id.q4:
                intent.putExtra("Question", "4");
                intent.putExtra("resourseInt", R.drawable.letter_d);
                intent.putExtra("option1", "Dog");
                intent.putExtra("option2", "queen");
                intent.putExtra("option3", "Banana");
                startActivity(intent);
                break;
            case R.id.q5:
                intent.putExtra("Question", "5");
                intent.putExtra("resourseInt", R.drawable.letter_m);
                intent.putExtra("option1", "cat");
                intent.putExtra("option2", "Stars");
                intent.putExtra("option3", "Mangoes");
                startActivity(intent);
                break;
            case R.id.q6:
                intent.putExtra("Question", "6");
                intent.putExtra("resourseInt", R.drawable.letter_p);
                intent.putExtra("option1", "Parrot");
                intent.putExtra("option2", "kite");
                intent.putExtra("option3", "Orange");
                startActivity(intent);
                break;
            case R.id.q7:
                intent.putExtra("Question", "7");
                intent.putExtra("resourseInt", R.drawable.letter_k);
                intent.putExtra("option1", "jackle");
                intent.putExtra("option2", "kangroo");
                intent.putExtra("option3", "Zebra");
                startActivity(intent);
                break;
            case R.id.q8:
                intent.putExtra("Question", "8");
                intent.putExtra("resourseInt", R.drawable.letter_q);
                intent.putExtra("option1", "Doll");
                intent.putExtra("option2", "Queen");
                intent.putExtra("option3", "Panda");
                startActivity(intent);
                break;


        }
    }
}