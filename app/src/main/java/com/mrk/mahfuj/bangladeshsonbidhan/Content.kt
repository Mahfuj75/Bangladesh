package com.mrk.mahfuj.bangladeshsonbidhan

open class Content {
    open var ContentType: String = ""
    open var MainContent: String = ""
    open var Type: Int = 1
    open var TextStyle: String = ""

    constructor(ContentType: String, MainContent: String,Type :Int,TextStyle : String ) {
        this.ContentType = ContentType
        this.MainContent = MainContent
        this.Type =  Type
        this.TextStyle = TextStyle
    }
}