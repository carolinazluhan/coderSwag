package com.example.carolina.coderswag2.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.carolina.coderswag2.Adapters.ProductsAdapter
import com.example.carolina.coderswag2.Model.Product
import com.example.carolina.coderswag2.R
import com.example.carolina.coderswag2.Utilities.EXTRA_PRODUCT_DETAIL
import kotlinx.android.synthetic.main.product_detail_activity.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_detail_activity)

        val productInfo = intent.getParcelableExtra<Product>(EXTRA_PRODUCT_DETAIL)
        val productName =  productInfo.title
        val productPrice = productInfo.price
        val productImage = productInfo.image

        val imageResource = this.resources.getIdentifier(productImage, "drawable", this.packageName)
        productDetailImage.setImageResource(imageResource)

        productDetailTitle.text = productName
        productDetailPrice.text = productPrice
        productDetailDescription.text = getString(R.string.default_product_description)
    }
}