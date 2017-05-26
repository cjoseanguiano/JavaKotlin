package com.devix.www.javakotlin.Java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.devix.www.javakotlin.Kotlin.PruebaKotlin;
import com.devix.www.javakotlin.Kotlin.TakeDataKotlin;
import com.devix.www.javakotlin.R;

//import static com.devix.www.javakotlin.Kotlin.TakeDataKotlinKt.KEY_USER;


public class TakeDataJava extends AppCompatActivity {
    private static final String TAG = TakeDataJava.class.getSimpleName();
    private EditText edtData;
    private Button btnData;
    private TextView txtData;
    private Button btnSendJava;
    private Button btnSendKotlin;
    private String valueEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_java);

        edtData = (EditText) findViewById(R.id.JedtData);
        btnData = (Button) findViewById(R.id.JbtnJava);
        txtData = (TextView) findViewById(R.id.JtxtData);
        btnSendJava = (Button) findViewById(R.id.JsendJava);
        btnSendKotlin = (Button) findViewById(R.id.JsendKotlin);


        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueEdt = edtData.getText().toString();

                if (valueEdt != null && valueEdt.length() >= 1) {
                    Toast.makeText(TakeDataJava.this, valueEdt, Toast.LENGTH_SHORT).show();
                    txtData.setText(valueEdt);

                } else {
                    Toast.makeText(TakeDataJava.this, "Campo Vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnSendJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TakeDataJava.this, PruebaJava.class);
                intent.putExtra("value", valueEdt);
                startActivity(intent);
            }
        });

        btnSendKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TakeDataJava.this, PruebaKotlin.class);
                intent.putExtra("value", valueEdt);
                startActivity(intent);
            }
        });
    }
}
