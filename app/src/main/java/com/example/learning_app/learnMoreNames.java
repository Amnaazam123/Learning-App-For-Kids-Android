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
                if(myClassArrayList.get(i).heading=="Fruit Names"){
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getBaseContext(),"Showing Fruit Names", Toast.LENGTH_LONG).show();

                            intent.putExtra("name1","1 - Apple");
                            intent.putExtra("name2","2 - Banana");
                            intent.putExtra("name3","3 - Mango");
                            intent.putExtra("name4","4 - Orange");
                            intent.putExtra("name5","5 - Cherry");
                            intent.putExtra("name6","6 - Grapes");
                            intent.putExtra("name7","7 - Peach");
                            intent.putExtra("name8","8 - Water Melon");
                            intent.putExtra("name9","9 - Pine Apple");
                            intent.putExtra("name10","10 - Strawberry");
                            startActivity(intent);
                        }
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();

                }
                else if(myClassArrayList.get(i).heading=="Color Names"){
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
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
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();

                }
                else if(myClassArrayList.get(i).heading=="Body Parts Names"){

                }
                else if(myClassArrayList.get(i).heading=="Vegetable Names"){

                }
                else if(myClassArrayList.get(i).heading=="Animals Names"){

                }
                else if(myClassArrayList.get(i).heading=="Flower Names"){

                }
                else if(myClassArrayList.get(i).heading=="Birds Names"){

                }
                else if(myClassArrayList.get(i).heading=="Insect Names"){

                }

            }
        });
    }
}



