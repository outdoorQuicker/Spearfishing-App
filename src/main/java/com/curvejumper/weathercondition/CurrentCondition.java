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
public class CurrentCondition implements Condition{

    private static String location = "";
    
    private static CurrentCondition instance = null;

    public static CurrentCondition getInstance() {
        if (instance == null) {
            instance = new CurrentCondition();
        }

        return instance;
    }

    protected CurrentCondition() {
        
    }
    
    @Override
    public void setWindSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRainyDays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSwellHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getWindSpeed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getRainyDays() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getSwellHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(String conditionForThisArea) {
        location = conditionForThisArea;
    }
    
}
