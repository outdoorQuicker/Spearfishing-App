/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.weathercondition.Condition;

/**
 *
 * @author curvejumper
 */
public interface WeatherManager {
    
    /**
     * get an array string of locations from hashmap
     * @return 
     */
    public String[] listLocations();
    
    /**
     * set json file with new weather data
     * @param location
     * @param condition 
     */
    public void updateWeatherData(String location, Condition condition);
    
    /**
     * by location, get the Condition object
     * @param location
     * @return Condition object 
     */
    public Condition getWeatherCondition(String location);
    
    /**
     * delete a weather conditions and forget the location
     * @param location 
     */
    public void deleteWeatherCondition(String location);
}
