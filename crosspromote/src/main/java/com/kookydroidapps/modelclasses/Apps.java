
package com.kookydroidapps.modelclasses;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Apps {

    @SerializedName("Apps")
    @Expose
    private List<App> apps = null;

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

}
