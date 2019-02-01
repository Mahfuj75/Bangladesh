package com.mrk.mahfuj.bangladeshsonbidhan

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log

import kotlinx.android.synthetic.main.activity_laws.*
import org.json.JSONException
import org.json.JSONObject

class LawsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var chapterId:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laws)
        setSupportActionBar(toolbar)

        chapterId = intent.getStringExtra("ChapterId").toInt()

        val myDataSet = parseJson(Functions().loadJson(applicationContext))
        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapterForLaws(myDataSet,applicationContext)

        recyclerView = findViewById<RecyclerView>(R.id.recycle_view_for_laws).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter




        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    private fun parseJson(value:String): ArrayList<Law> {
        val lawsArray = ArrayList<Law>()

        try {

            val obj1 = JSONObject(value)
            val laws = obj1.getJSONArray("Bangladesh").getJSONObject(1).getJSONArray("Main_Chapters").getJSONObject(chapterId-1).getJSONArray("Laws")
            for (i in 0 until laws.length()) {
                val jsonObject = laws.getJSONObject(i)
                val law =Law(jsonObject.getString("Title"))
                val con = laws.getJSONObject(i).getJSONArray("Content")
                val contentsArray = ArrayList<Content>()
                for (j in 0 until con.length())
                {
                    val jsonObj = con.getJSONObject(j)
                    val content = Content(jsonObj.getString("Content_Type"),jsonObj.getString("Main_Content"),jsonObj.getInt("Type"),jsonObj.getString("Text_Style"))
                    contentsArray.add(content)
                }
                law.Containts = contentsArray
                law.ContentTypeTitle = jsonObject.getString("Content_Type_Title")

                lawsArray.add(law)
            }


        } catch (e: JSONException) {
            Log.i("ERROR",e.localizedMessage)
        }


        return lawsArray
    }

}
