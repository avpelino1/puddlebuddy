package com.pelino.springboot.model.jdbc;

import com.pelino.springboot.model.LocationDAO;
import com.pelino.springboot.model.Location;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JDBCLocationDAO implements LocationDAO {

    private JdbcTemplate jdbc;

    public JDBCLocationDAO(DataSource dataSource){
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public Location retrieveOneLocation(Long id) {
        String sql = "SELECT * FROM location WHERE location_id = ?";
        SqlRowSet row = jdbc.queryForRowSet(sql, id);
        Location location = new Location();
        while (row.next()) {
            location = mapRowToLocation(row);
        }
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
