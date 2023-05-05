package com.example.wishlist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var wishes: List<Wish>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val wishRv = findViewById<RecyclerView>(R.id.wishRv)
        // Fetch the list of emails
        wishes = WishFetcher.getWishes()
        // Create adapter passing in the list of emails
        val adapter = WishAdapter(wishes)
        // Attach the adapter to the RecyclerView to populate items
        wishRv.adapter = adapter
        // Set layout manager to position the items
        wishRv.layoutManager = LinearLayoutManager(this)
    }
}

