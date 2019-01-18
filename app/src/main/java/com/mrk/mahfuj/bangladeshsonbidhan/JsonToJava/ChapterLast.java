
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChapterLast {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Chapter_Id")
    @Expose
    private Integer chapterId;
    @SerializedName("Text_Size")
    @Expose
    private Integer textSize;
    @SerializedName("Style")
    @Expose
    private String style;
    @SerializedName("Text_color")
    @Expose
    private String textColor;
    @SerializedName("Values")
    @Expose
    private List<Value> values = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
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

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
