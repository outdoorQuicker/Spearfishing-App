/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author curvejumper
 */
class WeatherWebSites {
    /**
     * This will get the weather website data 
     * it'll store specific weather objects that can be called whenever
     * only for quick access
     * 
     */
    //get date to know what current time is
    //@see http://www.tutorialspoint.com/java/java_date_time.htm
    Date date = new Date();
    SimpleDateFormat currentHour = new SimpleDateFormat("hha");
    //to use do currentHour.format(date)
    
    
    //here's another site
    //http://spearboard.com/showthread.php?s=5ba8829bc913a7350826824400eeb32a&t=78881
    
    
    //you will then want to see what it is closest to
    //wind site has specific times to get
    private String windSiteName = "http://www.windfinder.com/forecast/malibu";
    
    private Document windWebSite = Jsoup.connect(windSiteName).get();
}
