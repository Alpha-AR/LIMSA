package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_la);
        getSupportActionBar().hide();

        EditText e1,e2;
        Button b1;
        e1=findViewById(R.id.userID);
        e2=findViewById(R.id.userPassword);
        b1=findViewById(R.id.loginBtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LA.this,"testToast", Toast.LENGTH_SHORT).show();
                if(e1.getText().toString().compareTo("U111") == 0 && e2.getText().toString().compareTo("123")==0)
                {
                    Intent in = new Intent(LA.this,Admin .class);
                    startActivity(in);
                    finish();
                }
                if(e1.getText().toString().compareTo("U112") == 0 && e2.getText().toString().compareTo("456")==0)
                {
                    Intent in = new Intent(LA.this,Faculty .class);
                    startActivity(in);
                    finish();
                }
                if(e1.getText().toString().compareTo("U113") == 0 && e2.getText().toString().compareTo("789")==0)
                {
                    Intent in = new Intent(LA.this,HodA .class);
                    startActivity(in);
                    finish();
                }
            }
        });
    }


}