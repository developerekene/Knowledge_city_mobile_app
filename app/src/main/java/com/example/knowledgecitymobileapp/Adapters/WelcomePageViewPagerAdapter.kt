package com.example.knowledgecitymobileapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.knowledgecitymobileapp.Model.TitleAndDescription
import com.example.knowledgecitymobileapp.R

class WelcomePageViewPagerAdapter(var myList: MutableList<TitleAndDescription>): RecyclerView.Adapter<WelcomePageViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemTitle: TextView = itemView.findViewById(R.id.title_text_tv)
        var itemDetails: TextView = itemView.findViewById(R.id.title_text2_tv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.itemTitle.text = myList[position].title
        holder.itemDetails.text = myList[position].desc
    }

    override fun getItemCount(): Int {
        return myList.size
    }
}

