package com.1.weather2.api;

import com.1.weather2.api.models.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * API Interface
 */
public interface Api {

    @GET("weather")
    Call<CurrentWeather> getCurrentWeather(
            @Query("lat") float latitude,
            @Query("lon") float longitude,

            @Query("appid") String apiKey,
            @Query("units") String units
    );

}