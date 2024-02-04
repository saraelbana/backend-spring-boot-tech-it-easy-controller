package com.example.backendspringboottechiteasycontroller.models;

public class TVOption {
    private String name;
    private Boolean applicable;

    public TVOption() {
    }
    public TVOption(String name, Boolean applicable) {
        this.name = name;
        this.applicable = applicable;
    }
    public String getName() {
        return name;
    }
    public Boolean getApplicable() {
        return applicable;
    }
    public void setApplicable(Boolean applicable) {
        this.applicable = applicable;
    }
    public void switchOptionApplicability(){
        if(this.applicable)
            this.applicable = false;
        else
            this.applicable = true;
    }
}
