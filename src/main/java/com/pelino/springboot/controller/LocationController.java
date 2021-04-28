package com.pelino.springboot.controller;

import com.pelino.springboot.model.Location;
import com.pelino.springboot.model.dao.LocationDAO;
import com.pelino.springboot.service.WeatherService;
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
private LocationDAO ldao;

WeatherService service;

    @RequestMapping(path="/all", method= RequestMethod.GET)
    public List<Location> allLocations(){
        List<Location> locations = ldao.retrieveAllLocations();
        Location fullLocation;
        for(Location location : locations){
            fullLocation = service.getWeather(location);
            locations.add(fullLocation);
        }
        return locations;
    }

    @RequestMapping(path="/{id}", method=RequestMethod.GET)
    public Location locationDetails(@PathVariable Long id){
        return ldao.retrieveOneLocation(id);
    }

}
