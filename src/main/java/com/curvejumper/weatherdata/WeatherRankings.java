/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.weathercondition.CurrentCondition;

/**
 *
 * @author michael
 */
public class WeatherRankings {

    /*
    weather rankings will get CurrentWeatherData and IdealWeather
    to compare and put in hash map. 
    */ 
    private static CurrentCondition cc = null;
    
    public void renew() {
        //insert into hash map the compare() function data
        //collect new, current data
        //compare that data to ideal data
        //create rating system to feed to javascript
        for(int locationIndex = 0; locationIndex < locations.length; locationIndex++){
            cc = CurrentCondition.getInstance();
            cc.setLocation(locations[locationIndex]);
            cc.setWindSpeed();
        }
    }
    
    public void renew(String location){
        
    }
    
    /**
     * 
     * @param location
     * @return a simple 5 star(int) ranking system value
     */
    private void compare(String location) {
        
    }
    
}
