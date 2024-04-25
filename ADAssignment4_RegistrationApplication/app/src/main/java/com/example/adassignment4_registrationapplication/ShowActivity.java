package com.example.adassignment4_registrationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView name = findViewById(R.id.textView2);
        TextView gend = findViewById(R.id.textView3);
        TextView sub = findViewById(R.id.textView4);
//        Bundle extras = getIntent().getExtras();

        String showName=getIntent().getStringExtra("name");
        String showGend=getIntent().getStringExtra("gend");
        String showSub=getIntent().getStringExtra("sub");

//        if (extras != null) {
//            name.setText(extras.getString("name"));
//            gend.setText(extras.getString("gend"));
//            sub.setText(extras.getString("sub"));
//        }

        name.setText(showName);
        gend.setText(showGend);
        sub.setText(showSub);

    }
}
