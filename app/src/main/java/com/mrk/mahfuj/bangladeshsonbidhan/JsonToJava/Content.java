
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("Content_Type")
    @Expose
    private String contentType;
    @SerializedName("Main_Content")
    @Expose
    private String mainContent;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

}
