package com.mrk.mahfuj.bangladeshsonbidhan

import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.text.SpannableString
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.chapters_laws.view.*

class MyAdapterForContents(private var arrayList: ArrayList<Content>) : RecyclerView.Adapter<MyAdapterForContents.ViewHolder>() {


    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterForContents.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chapters_laws, parent, false)


        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MyAdapterForContents.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return arrayList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(value: Content) {
            when {
                value.Type==2 -> itemView.setPadding(10,0,0,0)
                value.Type==3 -> itemView.setPadding(20,0,0,0)
                value.Type==4 -> itemView.setPadding(30,0,0,0)
            }
            if(value.ContentType == "" && value.Type ==1)
            {
                itemView.textViewType.visibility = View.GONE
            }
            else
            {
                itemView.textViewType.text = value.ContentType
            }




            if(value.TextStyle == "Bold")
            {
                val spanString = SpannableString(value.MainContent)
                spanString.setSpan(UnderlineSpan(), 0, value.MainContent.length, 0)
                spanString.setSpan(StyleSpan(Typeface.BOLD), 0, value.MainContent.length, 0)
                spanString.setSpan(StyleSpan(Typeface.ITALIC), 0, value.MainContent.length, 0)
                itemView.textViewMain.text = spanString
                itemView.textViewMain.setTypeface(itemView.textViewMain.typeface, Typeface.BOLD_ITALIC)
            }
            else
            {
                itemView.textViewMain.text = value.MainContent
            }
            itemView.textViewMain.text = value.MainContent
            if(value.MainContent == "")
            {
                itemView.viewShow.visibility = View.VISIBLE
            }
        }


    }

}