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
    public List<Television> getAllTelevisions(){
        if (repository.findAll().isEmpty())
            throw new RecordNotFoundException();
        else
            return repository.findAll();
        //in case there were no records yet in my DB or the DB was dramatically wiped away ?!!

    }
    public void setTelevision(Television tv){
        repository.save(tv);
    }
    public void updateTelevision(Integer id, Television updatedTv){
        Optional<Television> tv =  repository.findById(id);
        if(tv.isEmpty())
            throw new RecordNotFoundException();

        /*method takes an updated Television object as a parameter and saves it using
        the save method provided by Spring Data JPA. If the entity with the same ID exists in the database,
        it will be updated with the new data. Otherwise, a new entity will be created.*/
       else repository.save(updatedTv);
    }
    public void deleteTelevision(Integer id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException();
        }
    }
}
