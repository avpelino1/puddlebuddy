package com.pelino.springboot.model.dao;

import com.pelino.springboot.model.Location;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocationDAO {

    public Location retrieveOneLocation(Long id);

    public List<Location> retrieveAllLocations();

}
