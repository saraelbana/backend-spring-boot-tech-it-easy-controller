package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.dtos.TelevisionDTO;
import com.example.backendspringboottechiteasycontroller.exceptions.PriceTooLowException;
import com.example.backendspringboottechiteasycontroller.mapper.TelevisionMapper;
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
    private final TVService tvService;
    private final TelevisionMapper tvMapper;

    public TelevisionController(TVService tvService,  TelevisionMapper tvMapper) {
        this.tvService = tvService;
        this.tvMapper = tvMapper;
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
    public ResponseEntity<TelevisionDTO> getSpecificTelevision(@PathVariable Integer id) {

        return ResponseEntity.ok(tvMapper.mapTelevisionToTelevisionDTO(tvService.getTelevision(id)));
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@RequestBody TelevisionDTO tvDTO) {

        if(tvDTO.getPrice()<100) { // getting null exception bc we didn't cover when it's = null
            throw new PriceTooLowException();
        }
        tvService.setTelevision(tvMapper.mapTelevisionDTOToTelevision(tvDTO));
        return ResponseEntity.created(null).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable Integer id, @RequestBody TelevisionDTO tvDTO) {
        tvService.updateTelevision(id, tvMapper.mapTelevisionDTOToTelevision(tvDTO));
        return ResponseEntity.ok("Television with ID "+ id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Integer id) {
        tvService.deleteTelevision(id);
        return ResponseEntity.noContent().build();
    }
}
