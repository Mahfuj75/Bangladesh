package com.mrk.mahfuj.bangladeshsonbidhan


import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.chapter_title_with_laws.view.*

class MyAdapterForLaws(private var arrayList: ArrayList<Law>,context: Context) : RecyclerView.Adapter<MyAdapterForLaws.ViewHolder>() {

    //this method is returning the view for each item in the list
    private var myContext: Context? = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterForLaws.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.chapter_title_with_laws, parent, false)
        this.arrayList = arrayList

        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MyAdapterForLaws.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position],context = this.myContext!!)

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return arrayList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(value: Law,context:Context) {
            val viewAdapter: RecyclerView.Adapter<*>
            val viewManager: RecyclerView.LayoutManager
            val myDataSet = value.Containts
            viewManager = LinearLayoutManager(context.applicationContext)
            viewAdapter = MyAdapterForContents(myDataSet!!)

            itemView.textViewTitle.text=value.Title
            itemView.textViewType.text =  value.ContentTypeTitle
            itemView.recycle_view_for_laws_item.apply {
                layoutManager = viewManager

                // specify an viewAdapter (see also next example)
                adapter = viewAdapter
            }
        }
        /*init {
            itemView.setOnClickListener()
            {
                *//*val intent =   Intent(itemView.context, LawsActivity::class.java).apply {
                    putExtra("Key", "Mahfuj")

                }
                startActivity(itemView.context,intent)

                val blog = Blog("a", 1)*//*
                val intent = Intent(this.itemView.context, LawsActivity::class.java)
                intent.putExtra("blogData", "Test")
                startActivity(this.itemView.context,intent,null)

            }

        }*/


    }

}