
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("Additional")
    @Expose
    private String additional;
    @SerializedName("Necessary")
    @Expose
    private String necessary;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getNecessary() {
        return necessary;
    }

    public void setNecessary(String necessary) {
        this.necessary = necessary;
    }

}
