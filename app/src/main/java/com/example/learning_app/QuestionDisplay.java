package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionDisplay extends AppCompatActivity {
    TextView tv;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_display);
        tv=findViewById(R.id.msg);
        Bundle extras = getIntent().getExtras();


        ImageView img = (ImageView) findViewById(R.id.question);
        RadioButton option1 = findViewById(R.id.op1);
        RadioButton option2 = findViewById(R.id.op2);
        RadioButton option3 = findViewById(R.id.op3);

        Intent intent = getIntent();
        img.setImageResource(extras.getInt("resourseInt"));
        option1.setText(intent.getStringExtra("option1"));
        option2.setText(intent.getStringExtra("option2"));
        option3.setText(intent.getStringExtra("option3"));
        msg=intent.getStringExtra("Question");

    }

    public void onRadioButtonClicked(View v) {
        switch(msg) {
            case "1":
                if (v.getId() == R.id.op1) {
                    tv.setText("Correct answer!");
                    tv.setTextColor(Color.parseColor("#006400"));
                } else {
                    tv.setText("Wrong answer!");
                    tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "2":
                switch (v.getId()){
                    case R.id.op2:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "3":
                switch (v.getId()){
                    case R.id.op3:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "4":
                switch (v.getId()){
                    case R.id.op1:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "5":
                switch (v.getId()){
                    case R.id.op3:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "6":
                switch (v.getId()){
                    case R.id.op1:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "7":
                switch (v.getId()){
                    case R.id.op2:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));
                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
                break;
            case "8":
                switch (v.getId()){
                    case R.id.op2:
                        tv.setText("Correct answer!");
                        tv.setTextColor(Color.parseColor("#006400"));

                        break;
                    default:
                        tv.setText("Wrong answer!");
                        tv.setTextColor(Color.parseColor("#8B0000"));
                }
        }
    }
}