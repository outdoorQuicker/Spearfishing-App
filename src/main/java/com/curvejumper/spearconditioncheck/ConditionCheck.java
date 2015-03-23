package com.curvejumper.spearconditioncheck;

import com.curvejumper.weatherdata.WeatherRankings;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

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
    private static final ScheduledExecutorService scheduler =
     Executors.newScheduledThreadPool(1);
    private static final long initialDelay = 0, period = 30;
    
    private static WeatherRankings rankings = new WeatherRankings();
    
    
    //the main function for refreshing weather rankings
    public static void refreshConditions(){
        //list of weather data for diffrent regions
        final Runnable weatherCheck = new Runnable(){
            @Override
            public void run() { rankings.renew(); }
        };
        System.out.println("\nEntering scheduled thread");
        scheduler.scheduleAtFixedRate(weatherCheck, initialDelay, period, TimeUnit.SECONDS);
        
    }
}
