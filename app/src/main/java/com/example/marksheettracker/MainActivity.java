package com.example.marksheettracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        button=(Button) findViewById(R.id.loginbtn1);
        button2=(Button) findViewById(R.id.singup1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloginbtn1();
            }
        }
        );
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { opensingup1(); }
        }
        );
    }
    public void openloginbtn1(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
    public void opensingup1(){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}