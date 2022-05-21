package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question9 extends AppCompatActivity {
    Button btn30,btn31,btn32,btn33;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        btn30=(Button)findViewById(R.id.btn30);
        btn31=(Button)findViewById(R.id.btn31);
        btn32=(Button)findViewById(R.id.btn32);
        btn33=(Button)findViewById(R.id.btn33);
        txt2=(TextView) findViewById(R.id.txt2);

        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn30.setBackgroundColor(Color.GREEN);
                txt2.setTextColor(Color.GREEN);
                txt2.setText("Correct Answer!!!");
                Intent intent= new Intent(question9.this,question10.class);
                startActivity(intent);

            }
        });

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn31.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn32.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn33.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });


    }
}