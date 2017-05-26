package com.devix.www.javakotlin.Kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.devix.www.javakotlin.Java.PruebaJava
import com.devix.www.javakotlin.R
import kotlinx.android.synthetic.main.activity_data_kotlin.*

//const val KEY_USER = "id"


class TakeDataKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_kotlin)

        var sendJava: Button = findViewById(R.id.KsendJava) as Button
        var sendKotlin: Button = findViewById(R.id.KsendKotlin) as Button
        var edtData: EditText = findViewById(R.id.KedtData) as EditText
        var txtText: TextView = findViewById(R.id.KtxtData) as TextView
        var valueEdt: String = ""

        KbtnKotlin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                valueEdt = edtData.text.toString()
                print(valueEdt)
                if (valueEdt != null && valueEdt.length >= 1) {
                    Toast.makeText(this@TakeDataKotlin, valueEdt, Toast.LENGTH_SHORT).show()
                    txtText.setText(valueEdt)
                } else {
                    Toast.makeText(this@TakeDataKotlin, "Campo vacio ", Toast.LENGTH_SHORT).show()
                }
            }
        })

        sendJava.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val sendActivity = Intent(this@TakeDataKotlin, PruebaJava::class.java)
                sendActivity.putExtra("value", valueEdt);
                startActivity(sendActivity)
                finish()
            }
        })


        sendKotlin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@TakeDataKotlin, PruebaKotlin::class.java)
                intent.putExtra("value", valueEdt)
                startActivity(intent)
                finish()
            }
        })
    }

/*    fun sendActivityJava(valueData: String) {
        val sendActivity = Intent(this@TakeDataKotlin, PruebaJava::class.java)
        sendActivity.putExtra("value", valueData);
        startActivity(sendActivity)
        finish()
    }

    fun sendActivityKotlin(valueData: String) {
        val intent = Intent(this@TakeDataKotlin, PruebaKotlin::class.java)
        intent.putExtra("value", valueData)
        startActivity(intent)
        finish()
    }*/

}