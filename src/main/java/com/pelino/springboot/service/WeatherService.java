package com.pelino.springboot.service;

import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private final String BASE_URL;
    private RestTemplate rest = new RestTemplate();

    public WeatherService(String baseURL){
        this.BASE_URL = baseURL;
    }





//    public User[] retrieveAllUsers(String authToken) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setBearerAuth(authToken);
//        HttpEntity entity = new HttpEntity(headers);
//        ResponseEntity<User[]> response = restTemplate.exchange(BASE_URL + "users", HttpMethod.GET, entity, User[].class);
//        return response.getBody();
//    }



}
