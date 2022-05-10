package com.example.myapplication;

import static com.example.myapplication.MainActivity.flag1;
import static com.example.myapplication.MainActivity.flag2;
import static com.example.myapplication.MainActivity.flag3;
import static com.example.myapplication.MainActivity.sa2;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HodA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod);
        getSupportActionBar().setTitle("Application Approval");

        TextView e1;
        e1 = findViewById(R.id.textView2);
        e1.setText(sa2);
        Toast.makeText(HodA.this, "Logged in as HOD", Toast.LENGTH_SHORT).show();
        Button b1, b2, b3, b4, b5, b6;
        b1 = findViewById(R.id.accept1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag1=true;
            }
        });
        b2 = findViewById(R.id.reject1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag1=false;
            }
        });
        b3 = findViewById(R.id.accept2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag2=true;
            }
        });
        b4 = findViewById(R.id.reject2);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag2=false;
            }
        });
        b5 = findViewById(R.id.accept3);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag3=true;
                final int timer = 1000;
                CountDownTimer cdt = new CountDownTimer(timer,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {
                        Intent in = new Intent(HodA.this,LA.class);
                        startActivity(in);
                        finish();
                    }
                }.start();
            }
        });
        b6 = findViewById(R.id.reject3);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag3=false;

                final int timer = 7000;
                CountDownTimer cdt = new CountDownTimer(timer,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {
                        Intent in = new Intent(HodA.this,LA.class);
                        startActivity(in);
                        finish();
                    }
                }.start();
            }
        });
    }
}