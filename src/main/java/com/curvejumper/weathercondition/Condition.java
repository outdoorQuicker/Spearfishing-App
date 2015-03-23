/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weathercondition;

/**
 *
 * @author curvejumper
 */
public interface Condition {
    
    public void setLocation(String conditionForThisArea);
    
    public String getLocation();
    
    public void setWindSpeed(double speed);
    
    //set the ammount of days since rain occured in the area
    public void setRainyDays();
    
    public void setSwellHeight();
    
    public double getWindSpeed();
    
    public void getRainyDays();
    
    public void getSwellHeight();
}
