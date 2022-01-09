package com.nishajain.staggeredgridviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        val data = ArrayList<RecyclerModel>()
        data.add(RecyclerModel(R.drawable.image1))
        data.add(RecyclerModel(R.drawable.image2))
        data.add(RecyclerModel(R.drawable.image8))
        data.add(RecyclerModel(R.drawable.image4))
        data.add(RecyclerModel(R.drawable.image5))
        data.add(RecyclerModel(R.drawable.image6))
        data.add(RecyclerModel(R.drawable.image7))
        data.add(RecyclerModel(R.drawable.image3))

        val adapter = RecyclerAdapter(data)
        recyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerview.adapter = adapter

    }
}