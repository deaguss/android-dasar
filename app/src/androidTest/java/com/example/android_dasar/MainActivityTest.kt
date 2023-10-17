package com.example.android_dasar

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    // activity scenario testing
    //    lateinit var activityScenario: ActivityScenario<MainActivity>
    //
    //    @Before
    //    fun setUp() {
    //        activityScenario = ActivityScenario.launch(MainActivity::class.java)
    //    }
    //
    //    @After
    //    fun tearDown() {
    //        activityScenario.close()
    //    }

    // activity scenario blue testing lebih cocok untuk instrument test
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testBlack(){
        println("Testing....")
    }


    // Espresso berisikan banyak class yang bisa digunakan untuk mempermudah kita melakukan Instrumentation Test
    // Karena terlalu banyak, jadi kita akan membahasnya sambil kelasnya berjalan, dan sambil kita praktekan
    // Package Espresso ada di androidx.test.espresso
}

open class MainActivity : Activity() {}
