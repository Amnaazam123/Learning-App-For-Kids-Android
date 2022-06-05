package com.example.learning_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<myClass> {
    public ListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<myClass> myClassArrayList){
        super(context,resource,myClassArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        myClass myclass = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        ImageView imageview = convertView.findViewById(R.id.imageheading);
        TextView fruittv = convertView.findViewById(R.id.fruitnames);
        TextView subtv = convertView.findViewById(R.id.submsg);
        imageview.setImageResource(myclass.getImageid());
        fruittv.setText(myclass.getHeading());
        subtv.setText(myclass.getSubheading());

        return convertView;
    }
}
