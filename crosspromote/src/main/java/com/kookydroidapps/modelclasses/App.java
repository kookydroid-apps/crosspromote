
package com.kookydroidapps.modelclasses;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class App {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("downloadUrl")
    @Expose
    private String downloadUrl;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("isFree")
    @Expose
    private Boolean isFree;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("visibile")
    @Expose
    private Boolean visibile;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getVisibile() {
        return visibile;
    }

    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
    }

    @NonNull
    @Override
    public String toString() {
        return getName() + ", " + getDownloadUrl() + ", " + getIconUrl();
    }
}