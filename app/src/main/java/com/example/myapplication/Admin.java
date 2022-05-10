package com.example.myapplication;

import static com.example.myapplication.MainActivity.flag1;
import static com.example.myapplication.MainActivity.flag2;
import static com.example.myapplication.MainActivity.flag3;
import static com.example.myapplication.MainActivity.flag4;
import static com.example.myapplication.MainActivity.sa2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().setTitle("Requisition Status");
        Toast.makeText(Admin.this,"Logged in as Admin", Toast.LENGTH_SHORT).show();

        TextView e1;
        e1=findViewById(R.id.textView2);
        e1.setText(sa2);

 /*       @Override
        public void onBackPressed() {
            super.onBackPressed();
            Intent in = new Intent(Admin.this, LA.class);
            startActivity(in);
            finish();
        }
        onBackPressed(); */

        Button b1,b2,b3,b4;
        b1=findViewById(R.id.issue1);
        b2=findViewById(R.id.issue2);
        b3=findViewById(R.id.issue3);
        b4=findViewById(R.id.issue4);
        if(flag1)
        {
            b1.setText("ISSUE");
            b1.setClickable(true);
        }
        if(flag2)
        {
            b2.setText("ISSUE");
            b2.setClickable(true);
        }
        if(flag3)
        {
            b3.setText("ISSUE");
            b3.setClickable(true);
        }
        if(flag4)
        {
            b4.setText("ISSUE");
            b4.setClickable(true);
        }

        ;

    }
}