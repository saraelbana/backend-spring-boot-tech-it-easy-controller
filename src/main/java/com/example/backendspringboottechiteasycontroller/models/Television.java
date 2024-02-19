package com.example.backendspringboottechiteasycontroller.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="televisions")
public class Television {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String name;
    private String brand;
    private  Double price;
    @Column(name="available_sizes")
    private Double availableSize;
    @Column(name="refresh_rate")
    private Double refreshRate;
    @Column(name="screen_type")
    private String screenType;
    @Column(name="screen_quality")
    private String screenQuality;
    @Column(name="source_img")
    private String sourceImg;
    //This error because available sizes is an array, so it needs to be linked to a table
    @ElementCollection
    @CollectionTable(name = "tv_sizes", joinColumns = @JoinColumn(name = "tv_id"))
    private List<Double> availableSizes = new ArrayList();
    @ElementCollection
    @CollectionTable(name = "tv_options", joinColumns = @JoinColumn(name = "tv_id"))
    private List<TVOption> options = new ArrayList();
    private Boolean wifi;

    @Column(name="smart_tv")
    private Boolean smartTV;
    @Column(name="voice_control")
    private Boolean voiceControl;
    @Column(nullable = false)
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambiLight;
    @Column(name="original_stock")
    private Integer originalStock;
    private Integer sold;

    public Integer getID() {
        return id;
    }
    private void generateID(Integer id) {
        this.id = id; // to be implemented later on to auto generate a sequence of unique IDs for the TVs
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

    public void setAvailableSize(Double availableSize) {
        this.availableSize = availableSize;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Double getAvailableSize() {
        return availableSize;
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