package com.1.weather2.api.models;

import com.google.gson.annotations.SerializedName;

public class CurrentWeather {

    private ForecastMain main;

    private ForecastWind wind;

    @SerializedName("name")
    private String cityName;


    public ForecastMain getMain() {
        return main;
    }

    public ForecastWind getWind() {
        return wind;
    }

    public String getCityName() {
        return cityName;
    }
}
