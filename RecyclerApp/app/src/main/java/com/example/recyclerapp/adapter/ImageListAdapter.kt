package com.example.recyclerapp.adapter

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerapp.model.ImageData
import kotlinx.android.synthetic.main.image_item_layout.view.*

class ImageListAdapter(val data: MutableList<ImageData>): RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    class ViewHolder(view: ViewGroup): RecyclerView.ViewHolder(view) {
        val image: ImageView = view.iv
        val name: TextView = view.image_name
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}