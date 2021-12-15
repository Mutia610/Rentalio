package com.mutia.rentalio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RentalioAdapter(private val data: ArrayList<RentalioModel>, val click: OnClickListener) : RecyclerView.Adapter<RentalioAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.nameCategory)
        var image : ImageView = itemView.findViewById(R.id.imgCategory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RentalioAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RentalioAdapter.ViewHolder, position: Int) {
        val item = data[position]

        holder.name.text = item.name
        Picasso.get().load(item.image)
            .into(holder.image)

        holder.itemView.setOnClickListener {
            click.booking()
        }
    }

    override fun getItemCount(): Int = data.size

    interface OnClickListener{
        fun booking()
    }
}