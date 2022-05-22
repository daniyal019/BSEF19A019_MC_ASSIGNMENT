package com.example.bsef19a019_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
public class Commits extends AppCompatActivity {
    ImageView cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commits);
        ImageView  cat=(ImageView)findViewById(R.id.imageView2);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            int img=bundle.getInt("a1");
            cat.setImageResource(img);

        }

    }
}