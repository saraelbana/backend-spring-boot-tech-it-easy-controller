package com.example.backendspringboottechiteasycontroller.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="cars")
public class Television {
    @Id
    @GeneratedValue
    private Integer ID;
    private String type;
    private String name;
    private String brand;
    private  Double price;
    //This error because available sizes is an array so it needs to be linked to a table
    //private List<Double> availableSizes = new ArrayList();
    private Double availableSizes;
    private Double refreshRate;
    private String screenType;
    private String screenQuality;
    private Boolean smartTV;
    private String sourceImg;
   //private List<TVOption> options = new ArrayList();

    private Boolean wifi;
    private Boolean voiceControl;
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambiLight;
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

    public void setAvailableSizes(Double availableSizes) {
        this.availableSizes = availableSizes;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Double getAvailableSizes() {
        return availableSizes;
    }

    //    public List<Double> getAvailableSizes() {
//        return availableSizes;
//    }
//    public void addTVAvailableSize(Double availableSize) {
//        this.availableSizes.add(availableSize);
//    }
//    public void setAvailableSizes(List<Double> availableSizes) {
//        this.availableSizes = availableSizes;
//    }
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
    public Boolean getWifi() {
        return wifi;
    }
    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getVoiceControl() {
        return voiceControl;
    }

    public Boolean getHdr() {
        return hdr;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public Boolean getAmbiLight() {
        return ambiLight;
    }

    public Integer getSold() {
        return sold;
    }

    public void setVoiceControl(Boolean voiceControl) {
        this.voiceControl = voiceControl;
    }

    public void setHdr(Boolean hdr) {
        this.hdr = hdr;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void setAmbiLight(Boolean ambiLight) {
        this.ambiLight = ambiLight;
    }

//    public void setSold(Integer sold) {
//        this.sold = sold;
//    }

    //    public List<TVOption> getOptions() {
//        return options;
//    }
//    public void setOptions(List<TVOption> options) {
//        this.options = options;
//    }
//    public void setExtraOption(TVOption extraOption) {
//        this.options.add(extraOption);
//    }
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