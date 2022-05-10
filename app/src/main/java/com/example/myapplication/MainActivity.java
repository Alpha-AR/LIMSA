package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static String sa1,sa2,sa3,sa4;
    public static boolean flag1=false,flag2=false,flag3=false,flag4=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //DbConnection con = new DbConnection();
        //con.DbConnection();

        final int timer = 1000;
        CountDownTimer cdt = new CountDownTimer(timer,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent in = new Intent(MainActivity.this,LA.class);
                startActivity(in);
                finish();
            }
        }.start();

    }
}