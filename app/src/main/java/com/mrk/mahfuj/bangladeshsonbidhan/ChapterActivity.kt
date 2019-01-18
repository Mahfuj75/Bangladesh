package com.mrk.mahfuj.bangladeshsonbidhan

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_chapter.*
import java.io.IOException
import java.lang.Exception
import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.Charset


class ChapterActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter)
        setSupportActionBar(toolbar)
        val myDataSet = parseJson(loadJson())
        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(myDataSet)

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
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



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_chapter, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun loadJSONFromAsset(): String {
        var json: String? = ""
        try {
            val inputStream = assets.open("yourfilename.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            return json!!
        }

        return json
    }
    private fun loadJson(): String{
        var json = ""
        try {
            val input = assets.open("Chapters.Json")
            val size =input.available()
            val buffer = ByteArray(size)
            input.read(buffer)
            input.close()
            json =  String(buffer, Charset.defaultCharset())
        }
        catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        return json
    }
    private fun parseJson(value:String): ArrayList<Chapter> {
        val chapterList = ArrayList<Chapter>()
        try {
            val obj = JSONObject(value)
            val jsonArray = obj.getJSONArray("Chapters")


            for (i in 0 until jsonArray.length()) {
                val jsonObject = jsonArray.getJSONObject(i)
                val chapter = Chapter(jsonObject.getString("Chapter")
                    ,jsonObject.getInt("Chapter_Id")
                    ,jsonObject.getInt("Text_Size")
                    ,jsonObject.getString("Style")
                    ,jsonObject.getString("Text_color"))
                chapterList.add(chapter)


            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        return chapterList
    }
}
