package com.example.liquid_swiper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cuberto.liquidswipetest.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pager = findViewById<LiquidPager>(R.id.pager)
        pager.adapter = Adapter(supportFragmentManager)
    }
}