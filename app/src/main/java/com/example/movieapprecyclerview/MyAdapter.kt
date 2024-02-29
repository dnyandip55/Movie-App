package com.example.movieapprecyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var moviesArrayList:ArrayList<Movies>,context:Activity):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(v: View):RecyclerView.ViewHolder(v) {
        val hImage=v.findViewById<ImageView>(R.id.imagePoster)
        val hTitle=v.findViewById<TextView>(R.id.movieName)
        val hYear=v.findViewById<TextView>(R.id.releaseYear)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
       val itemView=LayoutInflater.from(parent.context).inflate(R.layout.each_row,parent,false)
        return  MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem=moviesArrayList[position]
        holder.hTitle.text=currentItem.movieName
        holder.hImage.setImageResource(currentItem.moviePoster)
        holder.hYear.text=currentItem.releaseYear
    }

    override fun getItemCount(): Int {
        return moviesArrayList.size
    }

}