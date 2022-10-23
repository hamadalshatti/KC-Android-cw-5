package com.example.infopage1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class conf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conf);
        TextView pro = findViewById(R.id.thanks);
        TextView c= findViewById(R.id.c);
        TextView v= findViewById(R.id.v);
        TextView b= findViewById(R.id.b);
        TextView n= findViewById(R.id.n);

        TextView name2 = findViewById(R.id.name2);
        TextView passport2 = findViewById(R.id.passport2);
        TextView dis2 = findViewById(R.id.dis2);
        TextView email = findViewById(R.id.email);

        Intent book= getIntent();
        String q =book.getStringExtra("NAME");
        String w = book.getStringExtra("DIS");
        String e=book.getStringExtra("EMAIL");
        String r=book.getStringExtra("PASSPORT");
        name2.setText(q);
        passport2.setText(r);
        dis2.setText(w);
        email.setText(e);




    }
}