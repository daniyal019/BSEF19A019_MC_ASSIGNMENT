package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question3 extends AppCompatActivity {
    Button btn20,btn21,btn22,btn23;
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        btn20=(Button)findViewById(R.id.btn20);
        btn21=(Button)findViewById(R.id.btn21);
        btn22=(Button)findViewById(R.id.btn22);
        btn23=(Button)findViewById(R.id.btn24);
        txt2=(TextView) findViewById(R.id.txt2);

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn20.setBackgroundColor(Color.GREEN);
                txt2.setTextColor(Color.GREEN);
                txt2.setText("Correct Answer!!!");
                //Intent intent= new Intent(ExamModule.this,question2.class);
                //startActivity(intent);

            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn21.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn22.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn23.setBackgroundColor(Color.RED);
                txt2.setTextColor(Color.RED);
                txt2.setText("Wrong Choice!!!!");
            }
        });



    }
}