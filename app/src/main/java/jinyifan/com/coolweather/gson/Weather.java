package jinyifan.com.coolweather.gson;

import java.util.List;

/**
 * Created by asus on 2017/11/3.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

