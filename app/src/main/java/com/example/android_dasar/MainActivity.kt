package com.example.android_dasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var namedEditText: EditText
    private lateinit var sayHelloBtn: Button
    private lateinit var sayHelloText: TextView
    private lateinit var textAllData: TextView

    private fun initComponents(){
        // manggil component berdasarkan id
        namedEditText = findViewById(R.id.nameEditText)
        sayHelloBtn = findViewById(R.id.sayHelloButton)
        sayHelloText = findViewById(R.id.sayHelloText)
        textAllData = findViewById(R.id.allData)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        // get resource di main activity
        sayHelloText.text = resources.getText(R.string.app_name)


        // lambda action listener
        sayHelloBtn.setOnClickListener {

            // get json data menggunakan asserts manager
            val json = assets.open("data.json").bufferedReader().use { it.readText() }
            Log.i("ASSERTS", json)

            // get json data menggunakan raw
            val data = resources.openRawResource(R.raw.data).bufferedReader().use { it.readText() }
            Log.i("RAW", data)

            Log.i("BTN", "click button")
            val name: String = namedEditText.text.toString()

            sayHelloText.text = resources.getString(R.string.say_hello_text, name)

            // get all data resource string-array
            val itemNames = resources.getStringArray(R.array.item_name)
            val allDataText = itemNames.joinToString(", ") // Menggabungkan semua item dalam satu string dengan koma sebagai pemisah
            textAllData.text = allDataText


            // get other resource
            Log.i("valueResource", resources.getInteger(R.integer.int_name).toString())
            Log.i("valueResource", resources.getBoolean(R.bool.isPaid).toString())
            Log.i("valueResource", resources.getIntArray(R.array.int_array).joinToString(", "))
            Log.i("valueResource", resources.getColor(R.color.background_black, theme).toString())

            // set color btn
            sayHelloBtn.setBackgroundColor(resources.getColor(R.color.background_black, theme))
        }
    }
}