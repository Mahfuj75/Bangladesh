package com.mrk.mahfuj.bangladeshsonbidhan

import android.content.Intent
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.chapter_list_item.view.*

class MyAdapter(val chapters: ArrayList<Chapter>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chapter_list_item, parent, false)


        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindItems(chapters[position])

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return chapters.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(value: Chapter) {
            itemView.TextViewChapterName.text=value.ChapterContent
            itemView.TextViewChapterName.setTextColor(Color.parseColor(value.TextColor))
            itemView.TextViewChapterName.setLines(1)
        }
        init {
            itemView.setOnClickListener()
            {
            }

        }


    }

}