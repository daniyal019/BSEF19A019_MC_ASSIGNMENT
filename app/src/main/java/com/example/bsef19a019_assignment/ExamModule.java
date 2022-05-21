package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExamModule extends AppCompatActivity {
Button btn5,btn6,btn7,btn8;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_module);

        btn5=(Button)findViewById(R.id.btn10);
        btn6=(Button)findViewById(R.id.btn11);
        btn7=(Button)findViewById(R.id.btn12);
        btn8=(Button)findViewById(R.id.btn13);
        txt=(TextView) findViewById(R.id.txt1);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong Choice!!!!");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn6.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong Choice!!!!");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn7.setBackgroundColor(Color.GREEN);
                txt.setTextColor(Color.GREEN);
                txt.setText("Correct Answer!!!");
                Intent intent= new Intent(ExamModule.this,question2.class);
                startActivity(intent);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn8.setBackgroundColor(Color.RED);
                txt.setTextColor(Color.RED);
                txt.setText("Wrong Choice!!!!");
            }
        });


    }
}