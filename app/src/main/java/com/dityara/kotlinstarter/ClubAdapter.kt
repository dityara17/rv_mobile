package com.dityara.kotlinstarter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ClubAdapter (private val listClub: ArrayList<Club>) : RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {

     private lateinit var onItemClickCallback: OnItemClickCallback

    // disini kita perlu extends viewholdernya recyclerview
    inner class ClubViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubAdapter.ClubViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_club, parent, false)
        return ClubViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listClub.size
    }

    override fun onBindViewHolder(holder: ClubAdapter.ClubViewHolder, position: Int) {
        val club = listClub[position]

        Glide.with(holder.itemView.context)
            .load(club.photo)
            .override(55,55)
            .into(holder.imgPhoto)

        holder.tvName.text = club.name

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listClub[holder.adapterPosition])
        }

    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Club)
    }




}