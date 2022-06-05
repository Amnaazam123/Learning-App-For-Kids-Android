package com.example.learning_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class learnMoreNames extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more_names);
        ArrayList<myClass> myClassArrayList = new ArrayList<myClass>();
        myClassArrayList.add(new myClass("Fruit Names","Learn about 10 Fruit Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Color Names","Learn about 10 Color Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Body Parts Names","Learn about 10 Body Part Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Vegetable Names","Learn about 10 Vegetable Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Animals Names","Learn about 10 Animal Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Flower Names","Learn about 10 Flower Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Vehicle Names","Learn about 10 Vehicle Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Birds Names","Learn about 10 Bird Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Insect Names","Learn about 10 Insect Names",R.drawable.fruit));

        ListAdapter adapter=new ListAdapter(this,myClassArrayList);
        ListView listview=findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
}