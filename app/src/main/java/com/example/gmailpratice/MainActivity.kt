package com.example.gmailpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(28) {
            val index = it + 1
            items.add(ItemModel(
            "Facebook.com",
                "Today is 10/29/2023 Sunday",
                "10:30 PM",
                resources.getIdentifier("img", "drawable", packageName)
            ))
        }

        findViewById<ListView>(R.id.list_view).adapter = ItemAdapter(items)
    }


}