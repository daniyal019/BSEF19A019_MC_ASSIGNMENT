package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class ListLearning extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_learning);
         list=(ListView) findViewById(R.id.list);
        ArrayList<String>arr=new ArrayList<>();
    arr.add("Apple");
        arr.add("Ball");
        arr.add("Cat");
        arr.add("Dog");
        arr.add("Elephant");
        arr.add("Fish");
        arr.add("Grapes");
        arr.add("Hat");
        arr.add("Ink");
        arr.add("Jug");
        arr.add("Kite");
        arr.add("Lemon");
        arr.add("Melon");
        arr.add("Nest");
        arr.add("Owl");
        arr.add("Parrot");
        arr.add("Quran");
        arr.add("Rainbow");
        arr.add("Star");
        arr.add("Triangle");
        arr.add("Unicorn");
        arr.add("Violin");
        arr.add("Watch");
        arr.add("Xylophone");
        arr.add("Yacht");
        arr.add("Zebra");


        ArrayAdapter adapter1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adapter1);

    }
}