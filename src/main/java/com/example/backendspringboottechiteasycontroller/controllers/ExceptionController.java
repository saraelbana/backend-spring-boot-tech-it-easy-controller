package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.exceptions.PriceTooLowException;
import com.example.backendspringboottechiteasycontroller.exceptions.RecordNotFoundException;
import com.example.backendspringboottechiteasycontroller.exceptions.TVNameTooLongException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<String> exception(RecordNotFoundException exception)
    {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = IndexOutOfBoundsException.class)
    public ResponseEntity<String> exception(IndexOutOfBoundsException exception)
    {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = PriceTooLowException.class)
    public ResponseEntity<String> exception(PriceTooLowException exception){
        return new ResponseEntity<>("Error Message Price too low", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler( value = DataIntegrityViolationException.class)
    public ResponseEntity<String> exception(DataIntegrityViolationException exception)
    {
        return new ResponseEntity<>("null value in column hdr", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = TVNameTooLongException.class)
    public ResponseEntity<String> exception(TVNameTooLongException exception)
    {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
