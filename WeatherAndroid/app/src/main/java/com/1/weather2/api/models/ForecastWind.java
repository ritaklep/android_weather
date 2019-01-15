package com.1.weather2.api.models;

import com.google.gson.annotations.SerializedName;

public class ForecastWind {

    private float speed;

    @SerializedName("deg")
    private int degree;


    public float getSpeed() {
        return speed;
    }

    public int getDegree() {
        return degree;
    }

}
