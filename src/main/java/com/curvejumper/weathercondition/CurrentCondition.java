/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weathercondition;

import com.curvejumper.weather.SpearFishingWeather;

/**
 *
 * @author curvejumper
 */
public class CurrentCondition implements Condition{
    
    private static double CURRENT_WIND;
    private static int CURRENT_SWELL;
    private static int CURRENT_RAIN;

    private static String location = "";
    
    SpearFishingWeather weather = new SpearFishingWeather();
    private static CurrentCondition instance = null;

    public static CurrentCondition getInstance() {
        if (instance == null) {
            instance = new CurrentCondition();
        }

        return instance;
    }

    protected CurrentCondition() {
        
    }

    @Override
    public void setWindSpeed(double speed) {
        CURRENT_WIND = speed;
    }
    
    @Override
    public void setRainyDays(int rain) {
        CURRENT_RAIN = rain;
    }

    @Override
    public void setSwellHeight(int height) {
        CURRENT_SWELL = height;
    }

    @Override
    public double getWindSpeed() {
        return CURRENT_WIND;
    }

    @Override
    public int getRainyDays() {
        return CURRENT_RAIN;
    }

    @Override
    public int getSwellHeight() {
        return CURRENT_SWELL;
    }

    @Override
    public void setLocation(String conditionForThisArea) {
        location = conditionForThisArea;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
