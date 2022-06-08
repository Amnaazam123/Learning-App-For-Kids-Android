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
                if(myClassArrayList.get(i).heading=="Fruit Names"){
                    AlertDialog.Builder builder=new AlertDialog.Builder(learnMoreNames.this);
                    builder.setTitle("Are You Sure?");
                    builder.setMessage("You want to learn about Fruit Names.");
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
                            Toast.makeText(getBaseContext(),"Showing about", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();

                }
                else if(myClassArrayList.get(i).heading=="Color Names"){

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