package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishAdapter {

    class ViewHolder(wishAdapter: View) : RecyclerView.ViewHolder(wishAdapter) {

        val nameInput: TextView = itemView.findViewById(R.id.name)
        val priceInput: TextView = itemView.findViewById(R.id.price)
        val descInput: TextView = itemView.findViewById(R.id.desc)
    }

    abstract class WishAdapter(private val wishes: List<Wish>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {
        class ViewHolder {

            fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.example.wishlist.WishAdapter.ViewHolder {
                val context = parent.context
                val inflater = LayoutInflater.from(context)
                // Inflate the custom layout
                val contactView = inflater.inflate(R.layout.wish_list, parent, false)
                // Return a new holder instance
                return ViewHolder(contactView)

                fun onBindViewHolder(holder: com.example.wishlist.WishAdapter.ViewHolder, position: Int) {
                    // Get the data model based on position
                    val wish = wishes.get(position)
                    // Set item views based on views and data model
                    holder.nameInput.text = wish.name
                    holder.priceInput.text = wish.cost
                    holder.descInput.text = wish.desc
                }

                fun getItemCount(): Int {
                    return wishes.size
                }
            }
        }
    }


}

