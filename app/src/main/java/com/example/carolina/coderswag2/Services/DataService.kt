package com.example.carolina.coderswag2.Services

import com.example.carolina.coderswag2.Model.Category
import com.example.carolina.coderswag2.Model.Product

object DataService {

        val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
        )

        val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$20", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$18", "hat4")
        )

        val hoodies = listOf(
            Product("Devslopes Hoddie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoddie Red", "$32", "hoodie2"),
            Product("Devslopes Hoodie Black", "$28", "hoodie3"),
            Product("Devslopes Hoddie Purple", "$28", "hoodie4"),
            Product("Devslopes Hoddie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoddie Red", "$32", "hoodie2"),
            Product("Devslopes Hoodie Black", "$28", "hoodie3"),
            Product("Devslopes Hoddie Purple", "$28", "hoodie4"),
            Product("Devslopes Hoddie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoddie Red", "$32", "hoodie2"),
            Product("Devslopes Hoodie Black", "$28", "hoodie3"),
            Product("Devslopes Hoddie Purple", "$28", "hoodie4")
        )

        val shirts = listOf(
            Product("Devslopes Shirt Gray", "$18", "shirt1"),
            Product("Devslopes Shirt Red", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Black", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5"),
            Product("Devslopes Shirt Gray", "$18", "shirt1"),
            Product("Devslopes Shirt Red", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Black", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5"),
            Product("Devslopes Shirt Gray", "$18", "shirt1"),
            Product("Devslopes Shirt Red", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Black", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Kickflip Studios", "$18", "shirt5")
        )

        val digitalGood = listOf<Product>()

        fun getProducts(category: String) : List<Product> {
            when (category) {
                "SHIRTS" -> return shirts
                "HATS" -> return hats
                "HOODIES" -> return hoodies
                else -> return digitalGood
            }
        }

    }