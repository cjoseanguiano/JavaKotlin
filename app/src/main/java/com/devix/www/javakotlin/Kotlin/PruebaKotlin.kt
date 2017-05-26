package com.devix.www.javakotlin.Kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.devix.www.javakotlin.R

//const val KEY_USER = "id"

class PruebaKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba_kotlin)

        val intent: Intent = getIntent()
        val strings: String = intent.getStringExtra("value")
        println(strings.repeat(0))
        Toast.makeText(this,strings,Toast.LENGTH_SHORT).show()

    }
}
