package com.pelino.springboot.model.jdbc;

import com.pelino.springboot.model.dao.LocationDAO;
import com.pelino.springboot.model.Location;
import com.pelino.springboot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Component
public class JDBCLocationDAO implements LocationDAO {

    private WeatherService service;
    private JdbcTemplate jdbc;

    public JDBCLocationDAO(JdbcTemplate jdbc){
        this.jdbc = new JdbcTemplate();
    }

    @Override
    public Location retrieveOneLocation(Long id) {
        String sql = "SELECT * FROM location WHERE location_id = ?";
        SqlRowSet row = jdbc.queryForRowSet(sql, id);
        Location location = new Location();
        while (row.next()) {
            location = mapRowToLocation(row);
        }
        service.getWeather(location);
        return location;
    }

    @Override
    public List<Location> retrieveAllLocations() {
        List<Location> allLocations = new ArrayList<Location>();
        String sql = "SELECT * FROM location";
        SqlRowSet row = jdbc.queryForRowSet(sql);
        while(row.next()){
            Location location = new Location();
            mapRowToLocation(row);
            allLocations.add(location);
        }
        for(Location location : allLocations){
            service.getWeather(location);
        }
        return allLocations;
    }

    public Location mapRowToLocation(SqlRowSet row){
        Location location = new Location();
        location.setId(row.getLong("location_id"));
        location.setName(row.getString("name"));
        location.setLatitude(row.getDouble("latitude"));
        location.setLongitude(row.getDouble("longitude"));
        return location;
    }

}
