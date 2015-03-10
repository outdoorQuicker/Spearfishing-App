
package com.curvejumper.weatherdata;

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
    WeatherWebSites currentWeather = new WeatherWebSites();
    @Override
    public int Wind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public short Rain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Swell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
