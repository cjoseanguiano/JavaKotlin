package com.devix.www.javakotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.devix.www.javakotlin.Java.TakeDataJava;
import com.devix.www.javakotlin.Kotlin.TakeDataKotlin;

public class Home extends AppCompatActivity {

    private Button btnJava;
    private Button btnKotlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnJava = (Button) findViewById(R.id.btnJava);
        btnKotlin = (Button) findViewById(R.id.btnKotlin);

        btnJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, TakeDataJava.class);
                startActivity(intent);
            }
        });

        btnKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, TakeDataKotlin.class);
                startActivity(intent);
            }
        });
    }
}
