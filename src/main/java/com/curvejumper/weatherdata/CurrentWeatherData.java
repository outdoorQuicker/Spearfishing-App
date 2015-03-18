
package com.curvejumper.weatherdata;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author curvejumper
 */
public class CurrentWeatherData implements Weather{
/**
 * will call weatherWebsite data in order to get 
 * the current weather data from weatherWebsite object
 * @return 
 */
    
    
    //get date to know what current time is
    //@see http://www.tutorialspoint.com/java/java_date_time.htm
    Date date = new Date();
    SimpleDateFormat currentHour = new SimpleDateFormat("hh");
    
    //to use do currentHour.format(date)
    //wind web site 
    WindWebSite windWeather = new WindWebSite();
    private String windURL = "http://www.windfinder.com/forecast/malibu";
    
    @Override
    public double Wind() {
        windWeather.connectToSite(windURL);
        
        return windWeather.windSpeedMPH(currentHour);
    }

    @Override
    public short Rain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Swell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * The current hour for the present date
     * @param currentHour
     * @return 
     * The time it is closest to on the weather website
     */
    
    
}
