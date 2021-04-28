package com.pelino.springboot.service;

import com.pelino.springboot.model.CurrentWeather;
import com.pelino.springboot.model.Location;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

    private final String BASE_URL = "https://api.openweathermap.org/data/2.5/onecall";
    private final String APPID = "35afc549c3dba1572934ec2906dc00d6";
    private final String UNITS = "imperial";
    private RestTemplate rest = new RestTemplate();

    public Location getWeather(Location location){
        Long id = location.getId();
        String name = location.getName();

        location = rest.getForObject(BASE_URL + "?lat=" + location.getLatitude() + "&lon=" + location.getLongitude()+"&appid=" +
                APPID + "&units=" + UNITS, Location.class);
        int dt = location.getCurrent().getDt();

        List<CurrentWeather> historicalWeather = new ArrayList<CurrentWeather>();
        for(int i=0; i<5; i++){
            CurrentWeather historical = rest.getForObject(BASE_URL + "/timemachine?lat=" + location.getLatitude() + "&lon=" +
                location.getLongitude() + "&dt=" + dt + "&appid=" + APPID, CurrentWeather.class);
            historicalWeather.add(historical);
            dt -= 86400;
        }

        location.setHistoricalWeather(historicalWeather);
        location.setId(id);
        location.setName(name);
        return location;
    }

}
