package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question2 extends AppCompatActivity {
    Button btn10,btn11,btn12,btn13;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        btn10=(Button)findViewById(R.id.btn30);
        btn11=(Button)findViewById(R.id.btn31);
        btn12=(Button)findViewById(R.id.btn32);
        btn13=(Button)findViewById(R.id.btn33);
        txt1=(TextView) findViewById(R.id.txt2);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn10.setBackgroundColor(Color.RED);
                txt1.setTextColor(Color.RED);
                txt1.setText("Wrong Choice!!!!");

            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn11.setBackgroundColor(Color.RED);
                txt1.setTextColor(Color.RED);
                txt1.setText("Wrong Choice!!!!");
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn12.setBackgroundColor(Color.RED);
                txt1.setTextColor(Color.RED);
                txt1.setText("Wrong Choice!!!!");
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn13.setBackgroundColor(Color.GREEN);
                txt1.setTextColor(Color.GREEN);
                txt1.setText("Correct Answer!!!");
                Intent intent= new Intent(question2.this,question3.class);
                startActivity(intent);
            }
        });


    }
}