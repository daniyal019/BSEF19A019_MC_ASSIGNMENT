package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class ExamModule extends AppCompatActivity {
Button btn5,btn6,btn7,btn8;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_module);

        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        txt=(TextView) findViewById(R.id.txt);

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