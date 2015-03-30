/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.weathercondition;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author curvejumper
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
@JsonSubTypes({  
    @Type(value = IdealCondition.class, name = "idealCondition"),  
    @Type(value = CurrentCondition.class, name = "currentCondition")
    })
public interface Condition {
    
    public void setLocation(String conditionForThisArea);
    
    public String getLocation();
    
    public void setWindSpeed(double speed);
    
    //set the ammount of days since rain occured in the area
    public void setRainyDays(int rain);
    
    public void setSwellHeight(int height);
    
    public double getWindSpeed();
    
    public int getRainyDays();
    
    public int getSwellHeight();
}
