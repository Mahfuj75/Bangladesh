
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bangladesh {

    @SerializedName("Chapter_Zero")
    @Expose
    private ChapterZero chapterZero;
    @SerializedName("Main_Chapters")
    @Expose
    private List<MainChapter> mainChapters = null;
    @SerializedName("Chapter_Last")
    @Expose
    private ChapterLast chapterLast;

    public ChapterZero getChapterZero() {
        return chapterZero;
    }

    public void setChapterZero(ChapterZero chapterZero) {
        this.chapterZero = chapterZero;
    }

    public List<MainChapter> getMainChapters() {
        return mainChapters;
    }

    public void setMainChapters(List<MainChapter> mainChapters) {
        this.mainChapters = mainChapters;
    }

    public ChapterLast getChapterLast() {
        return chapterLast;
    }

    public void setChapterLast(ChapterLast chapterLast) {
        this.chapterLast = chapterLast;
    }

}
