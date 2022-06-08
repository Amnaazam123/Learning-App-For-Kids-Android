package com.example.learning_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class learnMoreNames extends AppCompatActivity {

    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more_names);
        listview=findViewById(R.id.listview);
        ArrayList<myClass> myClassArrayList = new ArrayList<>();
        myClassArrayList.add(new myClass("Birds Names","Learn about 10 Bird Names",R.drawable.birds));
        myClassArrayList.add(new myClass("Insect Names","Learn about 10 Insect Names",R.drawable.insects));
        myClassArrayList.add(new myClass("Fruit Names","Learn about 10 Fruit Names",R.drawable.fruit));
        myClassArrayList.add(new myClass("Color Names","Learn about 10 Color Names",R.drawable.colors));
        myClassArrayList.add(new myClass("Body Parts Names","Learn about 10 Body Part Names",R.drawable.bodyparts));
        myClassArrayList.add(new myClass("Vegetable Names","Learn about 10 Vegetable Names",R.drawable.vegetable));
        myClassArrayList.add(new myClass("Animals Names","Learn about 10 Animal Names",R.drawable.animals));
        myClassArrayList.add(new myClass("Flower Names","Learn about 10 Flower Names",R.drawable.flowers));


        ListAdapter adapter=new ListAdapter(this,0, myClassArrayList);
        listview.setAdapter(adapter);

        //view details
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(learnMoreNames.this,DetailActivity.class);
                AlertDialog.Builder builder=new AlertDialog.Builder(learnMoreNames.this);
                builder.setTitle("Are You Sure?");
                builder.setMessage("You want to learn about "+myClassArrayList.get(i).heading);
                builder.setCancelable(false);
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        if (myClassArrayList.get(i).heading == "Fruit Names") {
                            Toast.makeText(getBaseContext(), "Showing Fruit Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1", "1 - Apple");
                            intent.putExtra("name2", "2 - Banana");
                            intent.putExtra("name3", "3 - Mango");
                            intent.putExtra("name4", "4 - Orange");
                            intent.putExtra("name5", "5 - Cherry");
                            intent.putExtra("name6", "6 - Grapes");
                            intent.putExtra("name7", "7 - Peach");
                            intent.putExtra("name8", "8 - Water Melon");
                            intent.putExtra("name9", "9 - Pineapple");
                            intent.putExtra("name10", "10 - Strawberry");
                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Color Names"){
                            Toast.makeText(getBaseContext(), "Showing Color Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1", "1 - Red");
                            intent.putExtra("name2", "2 - Yellow");
                            intent.putExtra("name3", "3 - Orange");
                            intent.putExtra("name4", "4 - Teal");
                            intent.putExtra("name5", "5 - Parrot");
                            intent.putExtra("name6", "6 - Sky Blue");
                            intent.putExtra("name7", "7 - Taupe");
                            intent.putExtra("name8", "8 - Grape");
                            intent.putExtra("name9", "9 - Magenta");
                            intent.putExtra("name10", "10 - Olive Green");
                            startActivity(intent);

                        }
                        else if(myClassArrayList.get(i).heading=="Body Parts Names"){
                            Toast.makeText(getBaseContext(), "Showing Body part Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1", "1 - Nose");
                            intent.putExtra("name2", "2 - Eye");
                            intent.putExtra("name3", "3 - Ear");
                            intent.putExtra("name4", "4 - Hand");
                            intent.putExtra("name5", "5 - Foot");
                            intent.putExtra("name6", "6 - Finger");
                            intent.putExtra("name7", "7 - Neck");
                            intent.putExtra("name8", "8 - Arm");
                            intent.putExtra("name9", "9 - Foot");
                            intent.putExtra("name10", "10 - Tongue");
                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Vegetable Names"){
                            Toast.makeText(getBaseContext(), "Showing Vegetable Names", Toast.LENGTH_LONG).show();


                            intent.putExtra("name1","Potato");
                            intent.putExtra("name2","Tomato");
                            intent.putExtra("name3","Carrot");
                            intent.putExtra("name4","Garlic");
                            intent.putExtra("name5","Onion");
                            intent.putExtra("name6","Spanish");
                            intent.putExtra("name7","Ginger");
                            intent.putExtra("name8","Lady Finger");
                            intent.putExtra("name9","Cabbage");
                            intent.putExtra("name10","Pea");
                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Animals Names"){
                            Toast.makeText(getBaseContext(), "Showing Animal Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1","Lion");
                            intent.putExtra("name2","Elephant");
                            intent.putExtra("name3","Dog");
                            intent.putExtra("name4","Cat");
                            intent.putExtra("name5","Goat");
                            intent.putExtra("name6","Fox");
                            intent.putExtra("name7","Cow");
                            intent.putExtra("name8","Zebra");
                            intent.putExtra("name9","Tiger");
                            intent.putExtra("name10","Buffalo");
                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Flower Names"){
                            Toast.makeText(getBaseContext(), "Showing Flower Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1", "1 - Rose");
                            intent.putExtra("name2", "2 - Sunflower");
                            intent.putExtra("name3", "3 - Lily");
                            intent.putExtra("name4", "4 - Tulip");
                            intent.putExtra("name5", "5 - jasmine");
                            intent.putExtra("name6", "6 - Iris");
                            intent.putExtra("name7", "7 - Pancy");
                            intent.putExtra("name8", "8 - Lotus");
                            intent.putExtra("name9", "9 - Broom");
                            intent.putExtra("name10", "10 - Aster");
                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Birds Names"){
                            Toast.makeText(getBaseContext(), "Showing Bird Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1","Crow");
                            intent.putExtra("name2","Pigeon");
                            intent.putExtra("name3","Sparrow");
                            intent.putExtra("name4","Parrot");
                            intent.putExtra("name5","Eagle");
                            intent.putExtra("name6","Owl");
                            intent.putExtra("name7","peacock");
                            intent.putExtra("name8","Dove");
                            intent.putExtra("name9","Penguin");
                            intent.putExtra("name10","Duck");

                            startActivity(intent);
                        }
                        else if(myClassArrayList.get(i).heading=="Insect Names"){
                            Toast.makeText(getBaseContext(), "Showing Insect Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1","Ant");
                            intent.putExtra("name2","Grass Hopper");
                            intent.putExtra("name3","Butterfly");
                            intent.putExtra("name4","Caterpillar");
                            intent.putExtra("name5","Housefly");
                            intent.putExtra("name6","Mosquito");
                            intent.putExtra("name7","Cockroach");
                            intent.putExtra("name8","Dragon Fly");
                            intent.putExtra("name9","Lady Bird");
                            intent.putExtra("name10","Snail");
                            startActivity(intent);
                        }
                    }
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });
    }
}



