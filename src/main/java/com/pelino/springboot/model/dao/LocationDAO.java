package com.pelino.springboot.model.dao;

import com.pelino.springboot.model.Location;

import java.util.List;


public interface LocationDAO {

    Location retrieveOneLocation(Long id);

    List<Location> retrieveAllLocations();

}
