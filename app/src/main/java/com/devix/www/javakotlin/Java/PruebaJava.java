package com.devix.www.javakotlin.Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.devix.www.javakotlin.R;

public class PruebaJava extends AppCompatActivity {

    private static final String TAG = PruebaJava.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_java);

        Intent intent = getIntent();
        String string = intent.getStringExtra("value");
        Log.i(TAG, "onCreate: " + string);
    }
}
