package com.pelino.springboot.controller;

import com.pelino.springboot.model.Location;
import com.pelino.springboot.model.dao.LocationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Component
@RestController
@RequestMapping("/location")
public class LocationController {

@Autowired
private LocationDAO dao;

    @RequestMapping(path="/all", method= RequestMethod.GET)
    public List<Location> allLocations(){
        return dao.retrieveAllLocations();
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Location locationDetails(@PathVariable Long id){
        return dao.retrieveOneLocation(id);
    }

}
