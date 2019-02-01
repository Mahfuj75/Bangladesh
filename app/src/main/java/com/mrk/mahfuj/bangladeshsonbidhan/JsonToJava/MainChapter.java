
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainChapter {

    @SerializedName("Chapter")
    @Expose
    private String chapter;
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
    @SerializedName("Law")
    @Expose
    private List<Law> laws = null;

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
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

    public List<Law> getLaws() {
        return laws;
    }

    public void setLaws(List<Law> laws) {
        this.laws = laws;
    }

}
