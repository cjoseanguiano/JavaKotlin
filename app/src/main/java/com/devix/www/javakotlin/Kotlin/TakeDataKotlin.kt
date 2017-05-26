package com.devix.www.javakotlin.Kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.devix.www.javakotlin.Java.PruebaJava
import com.devix.www.javakotlin.R
import kotlinx.android.synthetic.main.activity_data_kotlin. *

//const val KEY_USER = "id"


class TakeDataKotlin : AppCompatActivity() {
// Note that this is not a class, or an object

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_kotlin)

        KbtnKotlin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var valueData = KedtData.text.toString()

                if (valueData != null && valueData.length >= 1) {
                    Toast.makeText(this@TakeDataKotlin, valueData, Toast.LENGTH_SHORT).show()
                    KtxtData.setText(valueData)

//                    Funcion para enviar de TakeDataKotlin a PruebaJava
                    //sendActivityJava(valueData)

//                    Funcion para enviar de TakeDataKotlin a PruebaKotlin
                    sendActivityKotlin(valueData)
                } else {
                    Toast.makeText(this@TakeDataKotlin, "Campo vacio ", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    fun sendActivityJava(valueData: String) {
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
    }
}