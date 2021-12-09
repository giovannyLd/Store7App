package com.example.store7app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView

import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class ProductoAdapter(private val dataSet:MutableList<ProductoEntity>):RecyclerView.Adapter<ProductoAdapter.ViewHolder>() {



    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val imagenItem:ImageView = itemView.findViewById(R.id.imagenItem)
        val title:TextView=itemView.findViewById(R.id.title)
        val datos:TextView=itemView.findViewById(R.id.datos)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_productos, parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ProductoAdapter.ViewHolder, position: Int) {

        var productEntity=dataSet[position]
       // holder.title.text=productEntity.title
        holder.datos.text=productEntity.datos
        Picasso.get().load(productEntity.imagen).into((holder.imagenItem))

    }

    override fun getItemCount(): Int {

        return dataSet.size

    }
}