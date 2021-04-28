package com.pelino.springboot.model;

public class DailyWeather {

    private int dt;
    private int sunrise;
    private int sunset;
    private int moonrise;
    private int moonset;
    private double moonphase;

    private double morn;
    private double day;
    private double eve;
    private double night;
    private double min;
    private double max;

    private double feelsMorn;
    private double feelsDay;
    private double feelsEve;
    private double feelsNight;

    private int pressure;
    private int humidity;
    private double dewPoint;
    private int windSpeed;
    private double windGust;
    private int windDeg;

    private int weatherID;
    private String weatherMain;
    private String weatherDesc;
    private String weatherIcon;

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public int getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(int moonrise) {
        this.moonrise = moonrise;
    }

    public int getMoonset() {
        return moonset;
    }

    public void setMoonset(int moonset) {
        this.moonset = moonset;
    }

    public double getMoonphase() {
        return moonphase;
    }

    public void setMoonphase(double moonphase) {
        this.moonphase = moonphase;
    }

    public double getMorn() {
        return morn;
    }

    public void setMorn(double morn) {
        this.morn = morn;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getEve() {
        return eve;
    }

    public void setEve(double eve) {
        this.eve = eve;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getFeelsMorn() {
        return feelsMorn;
    }

    public void setFeelsMorn(double feelsMorn) {
        this.feelsMorn = feelsMorn;
    }

    public double getFeelsDay() {
        return feelsDay;
    }

    public void setFeelsDay(double feelsDay) {
        this.feelsDay = feelsDay;
    }

    public double getFeelsEve() {
        return feelsEve;
    }

    public void setFeelsEve(double feelsEve) {
        this.feelsEve = feelsEve;
    }

    public double getFeelsNight() {
        return feelsNight;
    }

    public void setFeelsNight(double feelsNight) {
        this.feelsNight = feelsNight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public int getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(int windDeg) {
        this.windDeg = windDeg;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    public String getWeatherMain() {
        return weatherMain;
    }

    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public String getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        this.weatherIcon = weatherIcon;
    }
}
