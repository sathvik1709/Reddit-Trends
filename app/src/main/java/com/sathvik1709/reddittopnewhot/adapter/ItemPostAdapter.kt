package com.sathvik1709.reddittopnewhot.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sathvik1709.reddittopnewhot.R
import com.sathvik1709.reddittopnewhot.dto.Child
import com.squareup.picasso.Picasso

class ItemPostAdapter(private val myDataset: List<Child>?) :
        RecyclerView.Adapter<ItemPostAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val subreddit_name = view.findViewById<TextView>(R.id.subreddit_name)
        val user_name = view.findViewById<TextView>(R.id.user_name)
        val title = view.findViewById<TextView>(R.id.post_title)
        val mediaImage = view.findViewById<ImageView>(R.id.media_image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_post, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.subreddit_name.text = myDataset?.get(position)?.data?.subredditNamePrefixed
        holder.user_name.text = myDataset?.get(position)?.data?.authorFullname
        holder.title.text = myDataset?.get(position)?.data?.title

        val imageUrl = myDataset?.get(position)?.data?.preview?.images?.last()?.resolutions?.last()?.url?:""

        if(imageUrl.isNotEmpty()){
            Picasso.get().load(imageUrl.replace("&amp;", "&")).into(holder.mediaImage)
        }



    }

    override fun getItemCount() = myDataset?.size?:0
}