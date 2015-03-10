/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

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
     */
    //get date to know what current time is
    //you will then want to see what it is closest to
        //wind site has specific times to get
    Date date = new Date();
    private String windSiteName = "http://www.windfinder.com/forecast/malibu";
    
    private Document windWebSite = Jsoup.connect(windSiteName).get();
}
