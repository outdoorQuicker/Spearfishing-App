/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.util.ResourceResolver;
import com.curvejumper.weathercondition.Condition;
import com.curvejumper.weathercondition.ConditionManager;
import com.curvejumper.weathercondition.SpearConditionManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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
    public String[] listOfLocations() {
        System.out.println("\nGetting weatherMap in SpearWeatherManager");
        WeatherMap  weatherMap = getWeatherMap();
        System.out.println("Done!");
        System.out.println("\nGetting list of locations");
        Object[] objectLocationsArray = weatherMap.keySet().toArray();
        System.out.println("Done!");
        String[] stringLocationsArray = Arrays.copyOf(objectLocationsArray, objectLocationsArray.length, String[].class);
        return stringLocationsArray;
    }

    @Override
    public void updateWeatherData(String location, ConditionManager conditionManager) {
        WeatherMap weatherMap = getWeatherMap();
        weatherMap.put(location, (SpearConditionManager) conditionManager);
        persistWeatherMap(weatherMap);
    }

    @Override
    public ConditionManager getWeatherCondition(String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteWeatherCondition(String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void persistWeatherMap(WeatherMap weatherMap) {
        try {
			// convert the user object to JSON format
            JSON.writeValue(ResourceResolver.getUserFile(), weatherMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
