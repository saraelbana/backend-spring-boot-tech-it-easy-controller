package com.example.backendspringboottechiteasycontroller.services;

import com.example.backendspringboottechiteasycontroller.exceptions.RecordNotFoundException;
import com.example.backendspringboottechiteasycontroller.models.Television;
import com.example.backendspringboottechiteasycontroller.repositories.TVRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TVService {
    private final TVRepository repository;
    public TVService(TVRepository repository) {
        this.repository = repository;
    }
    public List<Television> getTelevisions( ){
        return repository.findAll();
    }
    public Television getTelevision(Integer id){
        Optional<Television> television =  repository.findById(id);
        if(television.isEmpty())
            throw new RecordNotFoundException();
        else return television.get(); //  .get is a method called on an optional to retrieve its value
    }
    void setTelevision(Television tv){
        repository.save(tv);
    }
}
