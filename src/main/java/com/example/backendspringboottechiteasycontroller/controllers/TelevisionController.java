package com.example.backendspringboottechiteasycontroller.controllers;

import com.example.backendspringboottechiteasycontroller.dtos.TelevisionDTO;
import com.example.backendspringboottechiteasycontroller.dtos.TelevisionInputDTO;
import com.example.backendspringboottechiteasycontroller.exceptions.PriceTooLowException;
import com.example.backendspringboottechiteasycontroller.mapper.TelevisionMapper;
import com.example.backendspringboottechiteasycontroller.models.Television;
import com.example.backendspringboottechiteasycontroller.repositories.TVRepository;
import com.example.backendspringboottechiteasycontroller.services.TVService;
import jakarta.validation.Valid;
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
        List<TelevisionDTO> televisionsDTO = new ArrayList<>();
        for(Television tv: tvService.getAllTelevisions()) {
            televisionsDTO.add(tvMapper.mapTelevisionToTelevisionDTO(tv));
        }
        return ResponseEntity.ok(televisionsDTO.toString());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TelevisionDTO> getSpecificTelevision(@PathVariable Integer id) {

        return ResponseEntity.ok(tvMapper.mapTelevisionToTelevisionDTO(tvService.getTelevision(id)));
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    @PostMapping()
    public ResponseEntity<Void> addTelevision(@Valid @RequestBody TelevisionInputDTO tvInputDTO) {

        if(tvInputDTO.getPrice()<100) { // take care of this case when getting null exception bc we didn't cover when it's = null
            throw new PriceTooLowException();
        }
        tvService.setTelevision(tvMapper.mapTelevisionDTOToTelevision(tvInputDTO));
        return ResponseEntity.created(null).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable Integer id, @RequestBody TelevisionInputDTO tvInputDTO) {
        tvService.updateTelevision(id, tvMapper.mapTelevisionDTOToTelevision(tvInputDTO));
        return ResponseEntity.ok("Television with ID "+ id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTelevision(@PathVariable Integer id) {
        tvService.deleteTelevision(id);
        return ResponseEntity.noContent().build();
    }

}
