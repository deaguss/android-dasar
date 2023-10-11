package com.example.android_dasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        val namedEditText: EditText = findViewById(R.id.nameEditText)
        val sayHelloBtn: Button = findViewById(R.id.sayHelloButton)
        val sayHelloText: TextView = findViewById(R.id.sayHelloText)

        sayHelloText.text = "Hello world"
    }
}