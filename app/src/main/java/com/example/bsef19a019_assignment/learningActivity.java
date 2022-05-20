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
if(str.equals("a")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.appl);


    startActivity(intent);
}
               else if(str.equals("b")) {
                    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

                    //intent.putExtra("id",edit.getText().toString());
                    intent.putExtra("apple", R.drawable.ball);


                    startActivity(intent);
                }

else if(str.equals("c")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.cat);


    startActivity(intent);
}


else if(str.equals("d")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.dog);


    startActivity(intent);
}

else if(str.equals("e")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.elephant);


    startActivity(intent);
}


else if(str.equals("f")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.fish);


    startActivity(intent);
}


else if(str.equals("g")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.grapes);


    startActivity(intent);
}

else if(str.equals("h")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.hat);


    startActivity(intent);
}


else if(str.equals("i")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.ink);


    startActivity(intent);
}

else if(str.equals("j")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.jug);


    startActivity(intent);
}

else if(str.equals("k")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.kite);


    startActivity(intent);
}

else if(str.equals("l")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.lemon);


    startActivity(intent);
}

else if(str.equals("m")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.melon);


    startActivity(intent);
}

else if(str.equals("n")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.nest);


    startActivity(intent);
}

else if(str.equals("o")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.owl);


    startActivity(intent);
}

else if(str.equals("p")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.parrot);


    startActivity(intent);
}


else if(str.equals("q")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.quran);


    startActivity(intent);
}

else if(str.equals("r")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.rainbow);


    startActivity(intent);
}

else if(str.equals("s")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.star);


    startActivity(intent);
}

else if(str.equals("t")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.triangle);


    startActivity(intent);
}


else if(str.equals("u")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.unicorn);


    startActivity(intent);
}

else if(str.equals("v")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.violin);


    startActivity(intent);
}

else if(str.equals("w")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.watch);


    startActivity(intent);
}

else if(str.equals("x")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.xylophone);


    startActivity(intent);
}

else if(str.equals("y")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.yacht);


    startActivity(intent);
}


else if(str.equals("z")) {
    Intent intent = new Intent(learningActivity.this, pictorialDisplay.class);

    //intent.putExtra("id",edit.getText().toString());
    intent.putExtra("apple", R.drawable.zebra);


    startActivity(intent);
}

            }












        });
    }}