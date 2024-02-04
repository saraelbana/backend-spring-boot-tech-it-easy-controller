package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.exceptions.RecordNotFoundException;
import com.example.backendspringboottechiteasycontroller.exceptions.TVNameTooLongException;
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
    @ExceptionHandler(value = TVNameTooLongException.class)
    public ResponseEntity<String> exception(TVNameTooLongException exception)
    {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
