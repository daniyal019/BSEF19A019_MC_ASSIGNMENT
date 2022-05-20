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
            }
            











        });
    }}