package com.example.myapplication;

import static com.example.myapplication.MainActivity.sa1;
import static com.example.myapplication.MainActivity.sa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        getSupportActionBar().setTitle("Requisition form");
        EditText e1,e2,e3;
        e1=findViewById(R.id.itemId);
        e2=findViewById(R.id.para);
        FloatingActionButton b2;
        b2=findViewById(R.id.send);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Faculty.this,"Request Sent", Toast.LENGTH_SHORT).show();
                sa1=e1.getText().toString();
                sa2=e2.getText().toString();
                Intent in = new Intent(Faculty.this, LA.class);
                    startActivity(in);
                    finish();

            }

        });


    }
}