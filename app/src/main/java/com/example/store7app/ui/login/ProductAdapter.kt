package com.example.store7app.ui.login
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.graphics.drawable.Drawable
import android.widget.Toast
import com.example.store7app.R
import com.squareup.picasso.Picasso
import java.io.InputStream
import java.net.URL


public  class ProductAdapter(private val dataSet: MutableList<productEntity>,private val listener:OnItemClickListener) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var productEntity = dataSet[position]

        holder.costItems.text = productEntity.costo;

        Picasso.get().load(productEntity.imagen).into(holder.imagenItem);

        holder.categoryItem.text = productEntity.categoria;

        var average = productEntity.average;
        if(average > 0){
            holder.scoreItem.text = average.toString()
        }else{
            holder.scoreItem.visibility = View.INVISIBLE;
        }

    }

    override fun getItemCount():Int{
        return dataSet.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val costItems :TextView = itemView.findViewById<TextView>(R.id.costItem)
        val imagenItem :ImageView = itemView.findViewById<ImageView>(R.id.imagenItem)
        val categoryItem:TextView = itemView.findViewById<TextView>(R.id.categoryItem);
        val scoreItem :TextView= itemView.findViewById<TextView>(R.id.scoreItem);

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            if(adapterPosition != RecyclerView.NO_POSITION){
                listener.onItemClick(adapterPosition)
            }
        }

    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }


}