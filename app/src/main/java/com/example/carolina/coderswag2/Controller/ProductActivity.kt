package com.example.carolina.coderswag2.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.carolina.coderswag2.Adapters.ProductsAdapter
import com.example.carolina.coderswag2.R
import com.example.carolina.coderswag2.Services.DataService
import com.example.carolina.coderswag2.Utilities.EXTRA_CATEGORY
import com.example.carolina.coderswag2.Utilities.EXTRA_PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_products.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(productType)) {product ->
            val productDetailIntent = Intent (this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT_DETAIL, product)
            startActivity(productDetailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 4
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
