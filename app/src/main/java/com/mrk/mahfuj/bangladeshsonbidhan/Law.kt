package com.mrk.mahfuj.bangladeshsonbidhan

import java.util.ArrayList

open class Law {
    open var Title: String = ""
    open var Containts: ArrayList<Content>? = null
    open var ContentTypeTitle :String =""

    constructor(Title: String) {
        this.Title = Title
    }

    constructor(Title: String, ContentTypeTitle : String, Constants: ArrayList<Content>?) {
        this.Title = Title
        this.Containts = Constants
        this.ContentTypeTitle = ContentTypeTitle
    }

}