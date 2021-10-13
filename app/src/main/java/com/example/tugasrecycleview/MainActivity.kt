package com.example.tugasrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidList = listOf<Android>(
            Android(
                R.drawable.kitkat,
                nameAndroid = "Android Kitkat",
                descAndroid = "Ini adalah android Kitkat bung bung bung"
            ),
            Android(
                R.drawable.lolipop,
                nameAndroid = "Android Lolipop",
                descAndroid = "Ini adalah android Lolipop bung bung bung"
            ),
            Android(
                R.drawable.mml,
                nameAndroid = "Android Marsmellow",
                descAndroid = "Ini adalah android Marsmellow bung bung bung"
            ),
            Android(
                R.drawable.noget,
                nameAndroid = "Android Nouget",
                descAndroid = "Ini adalah android Nouget bung bung bung"
            ),
            Android(
                R.drawable.oreo,
                nameAndroid = "Android OREO",
                descAndroid = "Ini adalah android Oreo bung bung bung"
            ),
            Android(
                R.drawable.pie,
                nameAndroid = "Android Pie",
                descAndroid = "Ini adalah android Pie bung bung bung"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_android)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AndroidAdapter(this,androidList){
            val intent = Intent (this, DetailAndroidActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}