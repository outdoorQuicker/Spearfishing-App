/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.util.ResourceResolver;
import com.curvejumper.weathercondition.Condition;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author curvejumper
 */
public class SpearWeatherManager implements WeatherManager {

    private static final ObjectMapper JSON = new ObjectMapper();

    private WeatherMap getWeatherMap() {
        WeatherMap weatherMap = null;
        File userFile = ResourceResolver.getUserFile();
        if (userFile.exists()) {
        	// read the file and convert the JSON content
            // to the UserMap object
            try {
                weatherMap = JSON.readValue(userFile, WeatherMap.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            weatherMap = new WeatherMap();
        }
        return weatherMap;
    }

    @Override
    public String[] listLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateWeatherData(String location, Condition condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Condition getWeatherCondition(String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWeatherCondition(String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
