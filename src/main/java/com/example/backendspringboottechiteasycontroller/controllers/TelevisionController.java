package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.exceptions.PriceTooLowException;
import com.example.backendspringboottechiteasycontroller.models.Television;
import com.example.backendspringboottechiteasycontroller.repositories.TVRepository;
import com.example.backendspringboottechiteasycontroller.services.TVService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/televisions")
public class TelevisionController {


    //private final TVRepository tvRepo;
    private TVService tvService;

    public TelevisionController(TVService tvService) {
        this.tvService = tvService;

    }

    //    @GetMapping("/filter")
//    public ResponseEntity<Object> getTelevisions(@RequestParam String brand, @RequestParam Integer maxPrice){
//
//        return ResponseEntity.ok(/*returnList*/);
//    }
    @GetMapping()
    public ResponseEntity<String> getTelevisions() {
        return ResponseEntity.ok("televisionDatabase");
    }
    @GetMapping("/{id}")
    public ResponseEntity<Television> getSpecificTelevision(@PathVariable Integer id) {

        //    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return null;

    }
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@RequestBody Television addTelevision) {
            //televisionDatabase.add(addTelevision);
        if(addTelevision.getPrice()<100) { // getting null exception bc we didn't cover when it's = null
            throw new PriceTooLowException();
        }
//      if(addTelevision.getHdr()== null){
//          throw new
//      }
        return ResponseEntity.created(null).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable Integer id) {
        return ResponseEntity.ok("Television with ID "+ id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Integer id) {
        return ResponseEntity.noContent().build();
    }
}
