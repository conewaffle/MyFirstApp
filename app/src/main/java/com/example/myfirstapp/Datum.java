
package com.example.myfirstapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nameDisplay")
    @Expose
    private String nameDisplay;
    @SerializedName("abv")
    @Expose
    private String abv;
    @SerializedName("ibu")
    @Expose
    private String ibu;
    @SerializedName("styleId")
    @Expose
    private Integer styleId;
    @SerializedName("isOrganic")
    @Expose
    private String isOrganic;
    @SerializedName("isRetired")
    @Expose
    private String isRetired;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusDisplay")
    @Expose
    private String statusDisplay;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("updateDate")
    @Expose
    private String updateDate;
    @SerializedName("style")
    @Expose
    private Style style;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("glasswareId")
    @Expose
    private Integer glasswareId;
    @SerializedName("availableId")
    @Expose
    private Integer availableId;
    @SerializedName("labels")
    @Expose
    private Labels labels;
    @SerializedName("glass")
    @Expose
    private Glass glass;
    @SerializedName("available")
    @Expose
    private Available available;
    @SerializedName("srmId")
    @Expose
    private Integer srmId;
    @SerializedName("srm")
    @Expose
    private Srm srm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDisplay() {
        return nameDisplay;
    }

    public void setNameDisplay(String nameDisplay) {
        this.nameDisplay = nameDisplay;
    }

    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getIsOrganic() {
        return isOrganic;
    }

    public void setIsOrganic(String isOrganic) {
        this.isOrganic = isOrganic;
    }

    public String getIsRetired() {
        return isRetired;
    }

    public void setIsRetired(String isRetired) {
        this.isRetired = isRetired;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDisplay() {
        return statusDisplay;
    }

    public void setStatusDisplay(String statusDisplay) {
        this.statusDisplay = statusDisplay;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGlasswareId() {
        return glasswareId;
    }

    public void setGlasswareId(Integer glasswareId) {
        this.glasswareId = glasswareId;
    }

    public Integer getAvailableId() {
        return availableId;
    }

    public void setAvailableId(Integer availableId) {
        this.availableId = availableId;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Available getAvailable() {
        return available;
    }

    public void setAvailable(Available available) {
        this.available = available;
    }

    public Integer getSrmId() {
        return srmId;
    }

    public void setSrmId(Integer srmId) {
        this.srmId = srmId;
    }

    public Srm getSrm() {
        return srm;
    }

    public void setSrm(Srm srm) {
        this.srm = srm;
    }

}
