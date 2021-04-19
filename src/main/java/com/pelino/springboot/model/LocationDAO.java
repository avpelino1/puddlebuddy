package com.pelino.springboot.model;

import java.util.List;

public interface LocationDAO {

    public Location retrieveOneLocation(Long id);

    public List<Location> retrieveAllLocations();

}
