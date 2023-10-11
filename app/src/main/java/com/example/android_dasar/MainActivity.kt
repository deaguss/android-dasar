package com.example.android_dasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var namedEditText: EditText
    private lateinit var sayHelloBtn: Button
    private lateinit var sayHelloText: TextView

    private fun initComponents(){
        // manggil component berdasarkan id
        namedEditText = findViewById(R.id.nameEditText)
        sayHelloBtn = findViewById(R.id.sayHelloButton)
        sayHelloText = findViewById(R.id.sayHelloText)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloText.text = "Hello world"


        // lambda action listener
        sayHelloBtn.setOnClickListener {
            val name: String = namedEditText.text.toString()

            sayHelloText.text = "Hello ${name}"

        }
    }
}