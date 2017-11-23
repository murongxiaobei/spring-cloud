package com.example.demo.web;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @RequestMapping("/save")
    public Object save(String name,String level,Boolean isUse){
        City city = cityRepository.save(new City("2","武汉",true));
        return city;
    }
    @RequestMapping("/queryByName")
    @Cacheable(value="city-key")
    public Object queryByName(String name){
        List<City> cityList = cityRepository.findByName(name);
        return cityList;
    }

    @RequestMapping("/list")
    public Object list(){
        return cityRepository.findAll();
    }
    @RequestMapping("/listByPage")
    public Page<City> listByPage(){
         Page<City> pages = cityRepository.findAll(new PageRequest(0,5)) ;
         return pages;
    }
}
