package com.mrk.mahfuj.bangladeshsonbidhan

import android.content.Context
import java.lang.Exception
import java.nio.charset.Charset

open class Functions {

    open fun loadJson(context: Context): String{
        var json = ""
        try {
            val input = context.assets.open("Chapters_main.Json")
            val size =input.available()
            val buffer = ByteArray(size)
            input.read(buffer)
            input.close()
            json =  String(buffer, Charset.defaultCharset())
        }
        catch (ex: Exception)
        {
            ex.printStackTrace()
        }
        return json
    }
}