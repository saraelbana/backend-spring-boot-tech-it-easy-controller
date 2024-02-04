package com.example.backendspringboottechiteasycontroller.models;

import java.util.ArrayList;
import java.util.List;

public class Television {
    private Integer ID;

    private String type;
    private String name;
    private String brand;
    private  Double price;
    private List<Double> availableSizes = new ArrayList();
    private Double refreshRate;
    private String screenType;
    private String screenQuality;
    private Boolean smartTV;
    private String sourceImg;
   private List<TVOption> options = new ArrayList();
    private Integer originalStock;
    private Integer sold;

    public Integer getID() {
        return ID;
    }
    private void generateID(Integer ID) {
        this.ID = ID; // to be implemented later on to auto generate a sequence of unique IDs for the TVs
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public List<Double> getAvailableSizes() {
        return availableSizes;
    }
    public void addTVAvailableSize(Double availableSize) {
        this.availableSizes.add(availableSize);
    }
    public void setAvailableSizes(List<Double> availableSizes) {
        this.availableSizes = availableSizes;
    }
    public Double getRefreshRate() {
        return refreshRate;
    }
    public void setRefreshRate(Double refreshRate) {
        this.refreshRate = refreshRate;
    }
    public String getScreenType() {
        return screenType;
    }
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
    public String getScreenQuality() {
        return screenQuality;
    }
    public void setScreenQuality(String screenQuality) {
        this.screenQuality = screenQuality;
    }
    public Boolean getSmartTV() {
        return smartTV;
    }
    public void setSmartTV(Boolean smartTV) {
        this.smartTV = smartTV;
    }
    public String getSourceImg() {
        return sourceImg;
    }
    public void setSourceImg(String sourceImg) {
        this.sourceImg = sourceImg;
    }
    public List<TVOption> getOptions() {
        return options;
    }
    public void setOptions(List<TVOption> options) {
        this.options = options;
    }
    public void setExtraOption(TVOption extraOption) {
        this.options.add(extraOption);
    }
    public Integer getOriginalStock() {
        return originalStock;
    }
    public void setOriginalStock(Integer originalStock) {
        this.originalStock = originalStock;
    }
    public Integer getTotalTVSold() {
        return sold;
    }
    public void setTotalTVSold(Integer sold) {
        this.sold = sold;
    }
}