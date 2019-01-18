
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Component {

    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("Text_Size")
    @Expose
    private Integer textSize;
    @SerializedName("Style")
    @Expose
    private String style;
    @SerializedName("Text_color")
    @Expose
    private String textColor;
    @SerializedName("Space_Below")
    @Expose
    private Integer spaceBelow;
    @SerializedName("Position")
    @Expose
    private String position;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Integer getSpaceBelow() {
        return spaceBelow;
    }

    public void setSpaceBelow(Integer spaceBelow) {
        this.spaceBelow = spaceBelow;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
