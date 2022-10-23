package com.example.infopage1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     EditText name = findViewById(R.id.name);
     EditText passport = findViewById(R.id.passport);
     EditText dis = findViewById(R.id.dis);
     EditText email = findViewById(R.id.emale09);
     TextView brand = findViewById(R.id.brand);
     TextView intro = findViewById(R.id.intro);
     Button next = findViewById(R.id.next);
     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String a= name.getText().toString();
             String b= passport.getText().toString();
             String c= dis.getText().toString();
             String d= email.getText().toString();
             Intent book= new Intent(MainActivity.this , conf.class);
             book.putExtra("NAME",a);
             book.putExtra("EMAIL",d);
             book.putExtra("PASSPORT",b);
             book.putExtra("DIS",c);
             startActivity(book);









         }
     });


    }



}

