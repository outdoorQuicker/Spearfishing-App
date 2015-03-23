/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.weather.SpearFishingWeather;
import com.curvejumper.weathercondition.Condition;
import com.curvejumper.weathercondition.ConditionManager;
import com.curvejumper.weathercondition.CurrentCondition;
import com.curvejumper.weathercondition.IdealCondition;
import com.curvejumper.weathercondition.SpearConditionManager;

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
    private static IdealCondition ic = null;
    private static SpearConditionManager manager = null;
    private static SpearFishingWeather weather = new SpearFishingWeather();
    private static int ranking, stopper = 0;
    private static SpearWeatherManager swm = new SpearWeatherManager();

    public void renew() {
        testAddLocation();
        //insert into hash map the compare() function data
        //collect new, current data
        //compare that data to ideal data
        //create rating system to feed to javascript
        System.out.println("\nRenewing weather Ranking data");
        String[] locations = swm.listOfLocations();
        System.out.println("\nDONE Renewing weather Ranking data");
        for (String location : locations) {
            System.out.println("\nSetting current condition data");
            setCurrentConditionData(location);
            System.out.println("Done! Setting current condition data");
            System.out.println("\nComparing current weather condition to ideal");
            compare(swm.getWeatherCondition(location).getIdealCondition(), cc);
            System.out.println("Done!");
            System.out.println("\nOrganizing condition data");
            organizeConditionData();
            System.out.println("Done!");
            System.out.println("Updataing JSON file");
            swm.updateWeatherData(location, manager);
            System.out.println("Done!");
        }
    }

    public void renew(String location) {

    }

    /**
     * compare the ideal weather condition of that location to the current
     * weather condition if the current is better than the ideal, replace ideal
     * then, rate the weather for today a 5. if it is not the ideal, do not
     * replace ideal and rate according to your algorithm judegment
     *
     * @param location
     * @return a simple 5 star(int) ranking system value
     */
    private void compare(Condition ideal, Condition current) {
         ic = (IdealCondition) ideal;
         if(current.getWindSpeed() <= ic.getWindSpeed()){
             ic.setWindSpeed(current.getWindSpeed());
             ranking++;
             System.out.println("\nranking got increased from WeatherRanking class");
         }
         /*
         add more if statements to centralize data or
         make central data function in condition objects
         */
    }

    private void organizeConditionData() {
        manager = SpearConditionManager.getInstance();
        manager.setCurrentCondition(cc);
        manager.setIdealCondition(cc);
        manager.setRanking(ranking);
    }

    private void setCurrentConditionData(String location) {
        cc = CurrentCondition.getInstance();
        cc.setLocation(location);
        cc.setWindSpeed(weather.Wind());
    }

    private void testAddLocation() {
        if(stopper == 0){
            System.out.println("Quickly setting up test case");
            ic = IdealCondition.getInstance();
            System.out.println("get ic instance");
            ic.setLocation("malibu");
            System.out.println("set up manager");
            manager = SpearConditionManager.getInstance();
            manager.setIdealCondition(ic);
            System.out.println("set current condition");
            cc = CurrentCondition.getInstance();
            manager.setCurrentCondition(cc);
            System.out.println("set ranking");
            manager.setRanking(0);
            System.out.println("set up test manager");
            swm.updateWeatherData("malibu", manager);
        }
    }

}
