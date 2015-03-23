/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.weathercondition.Condition;
import com.curvejumper.weathercondition.ConditionManager;

/**
 *
 * @author curvejumper
 */
public interface WeatherManager {
    
    /**
     * get an array string of locations from hashmap
     * @return 
     */
    public String[] listOfLocations();
    
    /**
     * set json file with new weather data
     * @param location
     * @param conditionManager - holds idealCondition and CurrentCondition data
     * as well as an int representing the ranking b/t ideal and CurrentConditions
     */
    public void updateWeatherData(String location, ConditionManager conditionManager);
    
    /**
     * by location, get the Condition object
     * @param location
     * @return Condition object 
     */
    public ConditionManager getWeatherCondition(String location);
    
    /**
     * delete a weather conditions and forget the location
     * @param location 
     */
    public void deleteWeatherCondition(String location);
}
