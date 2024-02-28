package com.example.backendspringboottechiteasycontroller.models;

import jakarta.persistence.Embeddable;
/*When you mark a class with @Embeddable, it signals to the JPA provider (like Hibernate)
that instances of this class should be treated as part of
the owning entity's structure. This allows you to define complex data structures within
your entities without the need for additional tables in the database*/

@Embeddable
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
