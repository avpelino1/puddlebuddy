package com.pelino.springboot.model;

public class Location {

    //datebase
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    //oneCall
   private String timezone;
   private Long timezomeOffset;
   private CurrentWeather current;
   private HourlyWeather hourly;
   private DailyWeather daily;
   private Alerts alert;

    //historical
    private CurrentWeather historicalCurrent;
    private HourlyWeather historicalHourly;

    public Location() { }

    public Location(Long id, String name, Double latitude, Double longitude){
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Long id, String name, Double latitude, Double longitude, String timezone, Long timezomeOffset, CurrentWeather current, HourlyWeather hourly, DailyWeather daily, Alerts alert) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.timezomeOffset = timezomeOffset;
        this.current = current;
        this.hourly = hourly;
        this.daily = daily;
        this.alert = alert;
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

    public Long getTimezomeOffset() {
        return timezomeOffset;
    }

    public void setTimezomeOffset(Long timezomeOffset) {
        this.timezomeOffset = timezomeOffset;
    }

    public CurrentWeather getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    public HourlyWeather getHourly() {
        return hourly;
    }

    public void setHourly(HourlyWeather hourly) {
        this.hourly = hourly;
    }

    public DailyWeather getDaily() {
        return daily;
    }

    public void setDaily(DailyWeather daily) {
        this.daily = daily;
    }

    public Alerts getAlert() {
        return alert;
    }

    public void setAlert(Alerts alert) {
        this.alert = alert;
    }

    public CurrentWeather getHistoricalCurrent() {
        return historicalCurrent;
    }

    public void setHistoricalCurrent(CurrentWeather historicalCurrent) {
        this.historicalCurrent = historicalCurrent;
    }

    public HourlyWeather getHistoricalHourly() {
        return historicalHourly;
    }

    public void setHistoricalHourly(HourlyWeather historicalHourly) {
        this.historicalHourly = historicalHourly;
    }
}