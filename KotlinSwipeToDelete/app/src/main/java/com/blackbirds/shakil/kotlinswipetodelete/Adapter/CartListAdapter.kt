package com.blackbirds.shakil.kotlinswipetodelete.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.blackbirds.shakil.kotlinswipetodelete.Model.Item
import com.blackbirds.shakil.kotlinswipetodelete.R
import com.squareup.picasso.Picasso

class CartListAdapter(val context: Context, val itemList: MutableList<Item>) :
        RecyclerView.Adapter<CartListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
                LayoutInflater.from(context).inflate(R.layout.cart_item_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = itemList[position].name
        holder.description.text = itemList[position].description
        holder.price.text = itemList[position].price
        Picasso.get().load(itemList[position].thumbnail).into(holder.thumbnail)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun removeItem(position: Int) {
        itemList.removeAt(position)
        notifyItemRemoved(position)
    }

    fun restoreItem(item: Item?, position: Int) {
        if (item != null) {
            itemList.add(position, item)
        }
        notifyItemInserted(position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var price: TextView
        var description: TextView
        var name: TextView
        var thumbnail: ImageView
        var viewBackground: RelativeLayout
        var viewForeground: RelativeLayout

        init {
            name = itemView.findViewById(R.id.name)
            description = itemView.findViewById(R.id.description)
            price = itemView.findViewById(R.id.price)
            thumbnail = itemView.findViewById(R.id.thumbnail)
            viewBackground = itemView.findViewById(R.id.view_background)
            viewForeground = itemView.findViewById(R.id.view_foreground)
        }
    }
}