package com.example.carolina.coderswag2.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.carolina.coderswag2.Adapters.CategoryAdapter
import com.example.carolina.coderswag2.Model.Category
import com.example.carolina.coderswag2.R
import com.example.carolina.coderswag2.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//                Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT)
//        }


    }
}
