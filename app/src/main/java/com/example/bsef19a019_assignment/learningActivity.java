package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class learningActivity extends AppCompatActivity {
    Button btn3;
    EditText edit;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        btn3 = (Button) findViewById(R.id.btn3);
        edit=(EditText)findViewById(R.id.edit);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
String str=edit.getText().toString().trim();
if(str.equals("a")  ) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.appl);
    intent.putExtra("name1", "Apple");


    startActivity(intent);
}
               else if(str.equals("A")  ) {
                    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.appl);
                    intent.putExtra("name1", "Apple");


                    startActivity(intent);
                }
               else if(str.equals("b")) {
                    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.ball);

    intent.putExtra("name1", "Ball");
                    startActivity(intent);
                }
else if(str.equals("B")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.ball);

    intent.putExtra("name1", "Ball");
    startActivity(intent);
}

else if(str.equals("c")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.cat);
    intent.putExtra("name1", "Cat");

    startActivity(intent);
}
else if(str.equals("C")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.cat);
    intent.putExtra("name1", "Cat");

    startActivity(intent);
}

else if(str.equals("d")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.dog);
    intent.putExtra("name1", "Dog");

    startActivity(intent);
}

else if(str.equals("D")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.dog);
    intent.putExtra("name1", "Dog");

    startActivity(intent);
}

else if(str.equals("e")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.elephant);
    intent.putExtra("name1", "Elephant");

    startActivity(intent);
}

else if(str.equals("E")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.elephant);
    intent.putExtra("name1", "Elephant");

    startActivity(intent);
}



else if(str.equals("f")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.fish);
    intent.putExtra("name1", "Fish");

    startActivity(intent);
}


else if(str.equals("F")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.fish);
    intent.putExtra("name1", "Fish");

    startActivity(intent);
}



else if(str.equals("g")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.grapes);
    intent.putExtra("name1", "Grapes");

    startActivity(intent);
}



else if(str.equals("G")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.grapes);
    intent.putExtra("name1", "Grapes");

    startActivity(intent);
}


else if(str.equals("h")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.hat);
    intent.putExtra("name1", "Hat");

    startActivity(intent);
}

else if(str.equals("H")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.hat);
    intent.putExtra("name1", "Hat");

    startActivity(intent);
}


else if(str.equals("i")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.ink);
    intent.putExtra("name1", "Ink");

    startActivity(intent);
}

else if(str.equals("I")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.ink);
    intent.putExtra("name1", "Ink");

    startActivity(intent);
}

else if(str.equals("j")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.jug);
    intent.putExtra("name1", "Jug");

    startActivity(intent);
}
else if(str.equals("J")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.jug);
    intent.putExtra("name1", "Jug");

    startActivity(intent);
}
else if(str.equals("k")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.kite);
    intent.putExtra("name1", "Kite");

    startActivity(intent);
}
else if(str.equals("K")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.kite);
    intent.putExtra("name1", "Kite");

    startActivity(intent);
}
else if(str.equals("l")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.lemon);
    intent.putExtra("name1", "Lemon");

    startActivity(intent);
}
else if(str.equals("L")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.lemon);
    intent.putExtra("name1", "Lemon");

    startActivity(intent);
}
else if(str.equals("m")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.melon);
    intent.putExtra("name1", "Melon");

    startActivity(intent);
}
else if(str.equals("M")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.melon);
    intent.putExtra("name1", "Melon");

    startActivity(intent);
}
else if(str.equals("n")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.nest);
    intent.putExtra("name1", "Nest");

    startActivity(intent);
}
else if(str.equals("N")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.nest);
    intent.putExtra("name1", "Nest");

    startActivity(intent);
}
else if(str.equals("o")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.owl);
    intent.putExtra("name1", "Owl");

    startActivity(intent);
}
else if(str.equals("O")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.owl);
    intent.putExtra("name1", "Owl");

    startActivity(intent);
}
else if(str.equals("p")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.parrot);
    intent.putExtra("name1", "Parrot");

    startActivity(intent);
}

else if(str.equals("P")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.parrot);
    intent.putExtra("name1", "Parrot");

    startActivity(intent);
}


else if(str.equals("q")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.quran);
    intent.putExtra("name1", "Quran");

    startActivity(intent);
}

else if(str.equals("Q")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.quran);
    intent.putExtra("name1", "Quran");

    startActivity(intent);
}


else if(str.equals("r")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.rainbow);
    intent.putExtra("name1", "Rainbow");

    startActivity(intent);
}

else if(str.equals("R")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.rainbow);
    intent.putExtra("name1", "Rainbow");

    startActivity(intent);
}


else if(str.equals("s")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.star);
    intent.putExtra("name1", "Star");

    startActivity(intent);
}

else if(str.equals("S")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.star);
    intent.putExtra("name1", "Star");

    startActivity(intent);
}

else if(str.equals("t")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.triangle);
    intent.putExtra("name1", "Triangle");

    startActivity(intent);
}
else if(str.equals("T")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.triangle);
    intent.putExtra("name1", "Triangle");

    startActivity(intent);
}

else if(str.equals("u")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.unicorn);
    intent.putExtra("name1", "Unicorn");

    startActivity(intent);
}

else if(str.equals("U")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.unicorn);
    intent.putExtra("name1", "Unicorn");

    startActivity(intent);
}


else if(str.equals("v")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.violin);
    intent.putExtra("name1", "Violin");

    startActivity(intent);
}
else if(str.equals("V")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.violin);
    intent.putExtra("name1", "Violin");

    startActivity(intent);
}
else if(str.equals("w")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.watch);
    intent.putExtra("name1", "Watch");

    startActivity(intent);
}
else if(str.equals("W")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.watch);
    intent.putExtra("name1", "Watch");

    startActivity(intent);
}

else if(str.equals("x")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.xylophone);
    intent.putExtra("name1", "Xylophone");

    startActivity(intent);
}
else if(str.equals("X")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.xylophone);
    intent.putExtra("name1", "Xylophone");

    startActivity(intent);
}
else if(str.equals("y")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.yacht);
    intent.putExtra("name1", "Yacht");

    startActivity(intent);
}

else if(str.equals("Y")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.yacht);
    intent.putExtra("name1", "Yacht");

    startActivity(intent);
}
else if(str.equals("z")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.zebra);
    intent.putExtra("name1", "Zebra");

    startActivity(intent);
}
else if(str.equals("Z")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.zebra);
    intent.putExtra("name1", "Zebra");

    startActivity(intent);
}

            }












        });
    }}