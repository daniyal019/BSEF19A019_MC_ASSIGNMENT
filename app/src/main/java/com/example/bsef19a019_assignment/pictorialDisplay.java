package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
public class pictorialDisplay extends AppCompatActivity {
    Button btn3;
    ImageView cat;
    EditText edit;
    String select;
    TextView textView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictorial_display);
        ImageView cat=(ImageView)findViewById(R.id.imageView4);
        textView6=(TextView)findViewById(R.id.textView6);
  Bundle bundle=getIntent().getExtras();
  if(bundle!=null)
  {
      String str=bundle.getString("name1");
      int img=bundle.getInt("apple");
          cat.setImageResource(img);
          textView6.setText(str);
  }




    //Intent recived=getIntent();
//int input= recived.getIntExtra("apple",1);
//cat.setImageResource(input);
}


    }
