package com.curvejumper.spearconditioncheck;

import com.curvejumper.weatherdata.WeatherRankings;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 *
 * @author michael
 */
class ConditionCheck {
    /*
    from java scheduler library. used to schedule the 
    task of getting weather data and rating how good the 
    conditions are for spearfising
    */
    private final ScheduledExecutorService scheduler =
     Executors.newScheduledThreadPool(1);
    
    //the main function for refreshing weather rankings
    public static void refreshConditions(){
        //list of weather data for diffrent regions
        WeatherRankings rankings = new WeatherRankings();
    }
}
