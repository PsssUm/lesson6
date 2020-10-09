package com.learneasy.lesson1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class TagsAdapter(private val tags: ArrayList<String>, private val onClickListener: MyOnClickListener) : RecyclerView.Adapter<TagsAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tagTV: TextView = view.findViewById<View>(R.id.tagTV) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tags_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val tag = tags[position]
        holder.tagTV.text = tag
        holder.tagTV.setOnClickListener {
            onClickListener.onClicked(tag)
        }
    }


    override fun getItemCount(): Int {
        return tags.size
    }

}