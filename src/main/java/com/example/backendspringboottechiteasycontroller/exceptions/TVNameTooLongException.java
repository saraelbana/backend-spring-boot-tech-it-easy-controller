package com.example.backendspringboottechiteasycontroller.exceptions;

public class TVNameTooLongException extends RuntimeException{
    public TVNameTooLongException(){super();}
    public TVNameTooLongException(String message){
        super(message);
    }
}
