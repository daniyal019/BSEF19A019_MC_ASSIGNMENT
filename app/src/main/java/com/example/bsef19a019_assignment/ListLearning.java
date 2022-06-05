package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
    arr.add("A For");
        arr.add("B For");
        arr.add("C For");
        arr.add("D For");
        arr.add("E For");
        arr.add("F For");
        arr.add("G For");
        arr.add("H For");
        arr.add("I For");
        arr.add("J For");
        arr.add("K For");
        arr.add("L For");
        arr.add("M For");
        arr.add("N For");
        arr.add("O For");
        arr.add("P For");
        arr.add("Q For");
        arr.add("R For");
        arr.add("S For");
        arr.add("T For");
        arr.add("U For");
        arr.add("V For");
        arr.add("W For");
        arr.add("X For");
        arr.add("Y For");
        arr.add("Z For");

        ArrayAdapter adapter1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adapter1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedFromList = (String) list.getItemAtPosition(i);
                if (i==0)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.appl);
                    intent.putExtra("name1", "Apple");


                    startActivity(intent);
                }
                else if(i==1)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);
                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.ball);

                    intent.putExtra("name1", "Ball");
                    startActivity(intent);
                }
                else if(i==2)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.cat);
                    intent.putExtra("name1", "Cat");

                    startActivity(intent);
                }
                else if(i==3)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);
                    intent.putExtra("apple", R.drawable.dog);
                    intent.putExtra("name1", "Dog");

                    startActivity(intent);
                }
                else if(i==4)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.elephant);
                    intent.putExtra("name1", "Elephant");

                    startActivity(intent);
                }
                else if(i==5)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.fish);
                    intent.putExtra("name1", "Fish");

                    startActivity(intent);
                }
                else if(i==6)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.grapes);
                    intent.putExtra("name1", "Grapes");

                    startActivity(intent);
                }
                else if(i==7)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.hat);
                    intent.putExtra("name1", "Hat");

                    startActivity(intent);
                }
                else if(i==8)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.ink);
                    intent.putExtra("name1", "Ink");

                    startActivity(intent);
                }
                else if(i==9)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.jug);
                    intent.putExtra("name1", "Jug");

                    startActivity(intent);
                }
                else if(i==10)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.kite);
                    intent.putExtra("name1", "Kite");

                    startActivity(intent);
                }
                else if(i==11)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.lemon);
                    intent.putExtra("name1", "Lemon");

                    startActivity(intent);
                }
                else if(i==12)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.melon);
                    intent.putExtra("name1", "Melon");

                    startActivity(intent);
                }
                else if(i==13)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.nest);
                    intent.putExtra("name1", "Nest");

                    startActivity(intent);
                }
                else if(i==14)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.owl);
                    intent.putExtra("name1", "Owl");

                    startActivity(intent);
                }
                else if(i==15)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.parrot);
                    intent.putExtra("name1", "Parrot");

                    startActivity(intent);
                }
                else if(i==16)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.quran);
                    intent.putExtra("name1", "Quran");

                    startActivity(intent);
                }
                else if(i==17)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    intent.putExtra("apple", R.drawable.rainbow);
                    intent.putExtra("name1", "Rainbow");

                    startActivity(intent);
                }
                else if(i==18)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.star);
                    intent.putExtra("name1", "Star");

                    startActivity(intent);
                }
                else if(i==19)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.triangle);
                    intent.putExtra("name1", "Triangle");

                    startActivity(intent);
                }
                else if(i==20)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.unicorn);
                    intent.putExtra("name1", "Unicorn");

                    startActivity(intent);
                }
                else if(i==21)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.violin);
                    intent.putExtra("name1", "Violin");

                    startActivity(intent);
                }
                else if(i==22)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.watch);
                    intent.putExtra("name1", "Watch");

                    startActivity(intent);
                }
                else if(i==23)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.xylophone);
                    intent.putExtra("name1", "Xylophone");

                    startActivity(intent);
                }
                else if(i==24)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.yacht);
                    intent.putExtra("name1", "Yacht");

                    startActivity(intent);
                }
                else if(i==25)
                {
                    Intent intent = new Intent(ListLearning.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.zebra);
                    intent.putExtra("name1", "Zebra");

                    startActivity(intent);
                }









            }
        });

    }
}