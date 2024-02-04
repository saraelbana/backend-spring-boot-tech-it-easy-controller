package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.exceptions.RecordNotFoundException;
import com.example.backendspringboottechiteasycontroller.models.Television;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TelevisionsController {

    List<Television> televisionDatabase = new ArrayList();

//    @GetMapping("/filter")
//    public ResponseEntity<Object> getTelevisions(@RequestParam String brand, @RequestParam Integer maxPrice){
//
//        return ResponseEntity.ok(/*returnList*/);
//    }
    @GetMapping("/televisions")
    public ResponseEntity<String> getTelevisions(){

        return ResponseEntity.ok("televisionDatabase");
    }
    @GetMapping("/television/{id}")
    public ResponseEntity<Television> getSpecificTelevision(@PathVariable Integer id)
    {
        Television television = televisionDatabase.get(id);
        if (television != null) {
            return ResponseEntity.ok(television);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PostMapping("/television")
    public ResponseEntity<Void> addTelevision(@RequestBody Television addTelevision){
        televisionDatabase.add(addTelevision);
        return ResponseEntity.created(null).build();
    }
    @PutMapping("/television/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable Integer id)
    {
        return ResponseEntity.ok("Television with ID "+ id);
    }
    @DeleteMapping("/television/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Integer id)
    {
        return ResponseEntity.noContent().build();
    }
}
