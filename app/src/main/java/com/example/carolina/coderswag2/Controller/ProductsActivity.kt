package com.example.carolina.coderswag2.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.carolina.coderswag2.R
import com.example.carolina.coderswag2.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
