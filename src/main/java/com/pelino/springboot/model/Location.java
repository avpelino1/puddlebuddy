package com.pelino.springboot.model;

import java.util.List;

public class Location {

    //database
    private Long id;
    private String name;

    private Double longitude;
    private Double latitude;

    //oneCall
   private String timezone;
   private Long timezoneOffset;
   private CurrentWeather current;
   private List<HourlyWeather> hourly;
   private List<DailyWeather> daily;
   private Alerts alert;

    //historical
    private List<CurrentWeather> historicalWeather;

    public Location() { }

    public Location(Long id, String name, Double latitude, Double longitude) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() { return id; }

    public String getName() {
        return name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Long getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Long timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public CurrentWeather getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    public List<HourlyWeather> getHourly() {
        return hourly;
    }

    public void setHourly(List<HourlyWeather> hourly) {
        this.hourly = hourly;
    }

    public List<DailyWeather> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyWeather> daily) {
        this.daily = daily;
    }

    public Alerts getAlert() {
        return alert;
    }

    public void setAlert(Alerts alert) {
        this.alert = alert;
    }

    public List<CurrentWeather> getHistoricalWeather() {
        return historicalWeather;
    }

    public void setHistoricalWeather(List<CurrentWeather> historicalWeather) {
        this.historicalWeather = historicalWeather;
    }

}