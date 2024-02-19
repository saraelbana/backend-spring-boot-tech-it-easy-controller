package com.example.backendspringboottechiteasycontroller.mapper;

import com.example.backendspringboottechiteasycontroller.dtos.TelevisionDTO;
import com.example.backendspringboottechiteasycontroller.models.Television;
import org.springframework.stereotype.Component;

@Component
public class TelevisionMapper {
    public TelevisionDTO mapTelevisionToTelevisionDTO(Television tv)
    {
        TelevisionDTO tvDTO = new TelevisionDTO();

        tvDTO.setName(tv.getName());
        tvDTO.setBrand(tv.getBrand());
        tvDTO.setPrice(tv.getPrice());
        tvDTO.setType(tv.getType());
        tvDTO.setRefreshRate(tv.getRefreshRate());
        tvDTO.setScreenType(tv.getScreenType());
        tvDTO.setScreenQuality(tv.getScreenQuality());
        tvDTO.setSourceImg(tv.getSourceImg());
        tvDTO.setAvailableSize(tv.getAvailableSize());
        tvDTO.setOptions(tv.getOptions());
        tvDTO.setId(tv.getID());
        return tvDTO;
    }
    public Television mapTelevisionDTOToTelevision(TelevisionDTO tvDTO)
    {
        Television tv = new Television();
        tv.setName(tvDTO.getName());
        tv.setBrand(tvDTO.getBrand());
        tv.setPrice(tvDTO.getPrice());
        tv.setType(tvDTO.getType());
        tv.setRefreshRate(tvDTO.getRefreshRate());
        tv.setScreenType(tvDTO.getScreenType());
        tv.setScreenQuality(tvDTO.getScreenQuality());
        tv.setSourceImg(tvDTO.getSourceImg());
        tv.setAvailableSize(tvDTO.getAvailableSize());
        tv.setOptions(tvDTO.getOptions());
        return tv;
    }
}
