package com.example.backendspringboottechiteasycontroller.dtos;



import com.example.backendspringboottechiteasycontroller.models.TVOption;

import java.util.ArrayList;
import java.util.List;

public class TelevisionDTO {
    private String type;
    private String name;
    private String brand;
    private  Double price;
    private Double availableSize;
    private Double refreshRate;
    private String screenType;
    private String screenQuality;
    private Boolean smartTV;
    private String sourceImg;
    private List<Double> availableSizes = new ArrayList();
    private List<TVOption> options = new ArrayList();
    private Boolean wifi;
    private Boolean voiceControl;
    private Boolean hdr;
    private Boolean bluetooth;
    private Boolean ambiLight;
    private Integer originalStock;
}
