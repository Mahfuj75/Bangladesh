
package com.mrk.mahfuj.bangladeshsonbidhan.JsonToJava;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonToJava {

    @SerializedName("Bangladesh")
    @Expose
    private List<Bangladesh> bangladesh = null;

    public List<Bangladesh> getBangladesh() {
        return bangladesh;
    }

    public void setBangladesh(List<Bangladesh> bangladesh) {
        this.bangladesh = bangladesh;
    }

}
