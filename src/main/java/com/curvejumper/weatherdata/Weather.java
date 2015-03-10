/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weatherdata;

/**
 *
 * @author curvejumper
 */
public interface Weather {

    /**
     *a wind object
     * @return  wind speed
     */
    public int Wind();
    
    /**
     *checks if it rained in the near past
     * and compares that to an ideal rain past scenario
     * @return days since last rain
     * 4 is last short since after is negligable
    */
    public short Rain();
    
    
    /**
     * Compares the actual swell data to an 
     * ideal swell object
     * @return swell size (in feet)
     */
    public int Swell();
    
    
    
    
}
