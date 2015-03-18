/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import com.curvejumper.weatherwebsites.WeatherWebSite;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author curvejumper
 */
class WindWebSite implements WeatherWebSite{
    /**
     * This will get the weather website data 
     * it'll store specific weather objects that can be called whenever
     * only for quick access
     * 
     */
    private String[] webSiteTimes = {"02", "05", "08", "11", "14", "17", "20", "23"};
    private static final int KEY = 11;
    
    //here's another site
    //http://spearboard.com/showthread.php?s=5ba8829bc913a7350826824400eeb32a&t=78881
    
    
    private Document windWebSite;
    private Elements windSpeed;
    
    
    /**for this specific site(i know, bad) it will get the first html table 
     * that is specified in the source (view-source:http://www.windfinder.com/forecast/<beach>)
     * We are only concerned with today's date at the moment for spearing NOW
     */
    private Element weatherTable, weatherDate;
    // if I had to iterate over many elements Iterator<Element> ite;
    private Elements weatherTimes, weatherWindSpeeds;
    Iterator<Element> weatherTableRows;
    
    private static final int MAX_WIND_SPEED = 100;
    private static final double KNOTTS_TO_MPH_CONST = 1.15078;
    public WindWebSite (){
        //collect appropiate data
        
        //grap first table in site
        weatherTable = windWebSite.select("table[class=weathertable]").first();
        //grab table rows from current table
        weatherTableRows = weatherTable.select("tr").iterator();
        //get date from first table row
        weatherDate = weatherTableRows.next().select("th[class=heading-date]").first();
        //get times from second table row
        weatherTimes = weatherTableRows.next().select("span");
        //get speed from FOURTH table row
        weatherTableRows.next();
        weatherWindSpeeds = weatherTableRows.next().select("td");
    }
    
    public double windSpeedMPH(SimpleDateFormat currentHour) {
        //call to get the time format that the website uses
        String time = callibrateHour(currentHour, webSiteTimes.length);
        
        double currentWindSpeed = MAX_WIND_SPEED;
        for(int row = 0; row <= weatherTimes.size(); row++){
            if(time.equals(weatherTimes.get(row).text())){
                currentWindSpeed = Double.parseDouble(weatherWindSpeeds.get(row).text());
            }
        }
        currentWindSpeed = currentWindSpeed * KNOTTS_TO_MPH_CONST;
        return currentWindSpeed;
    }

    @Override
    public void connectToSite(String url) {
        try {
            windWebSite = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(WindWebSite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String callibrateHour(SimpleDateFormat currentHour, int max) {
        for(int closestHour = 0; closestHour < max; closestHour++){
            if(Integer.parseInt(currentHour.toString()) < Integer.parseInt(webSiteTimes[closestHour])){
                return webSiteTimes[(closestHour - 1) % webSiteTimes.length] + "h";
            }
        }
        //if it returns nothing then just give the average hour;
        return "11h";
    }
    
}
