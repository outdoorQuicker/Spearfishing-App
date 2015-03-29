
package com.curvejumper.weathercondition;

/**
 *The object will hold ideal condition information for a specific location
 * <p>
 * can be changed if a new ideal condition is found in current condition object
 * 
 * @author curvejumper
 */
public class IdealCondition implements Condition {
    
    /**the ideal conditions start horrible but will change with
     * a comparison to the current conditions
     */
    
    private static IdealCondition instance = null;

    public static IdealCondition getInstance() {
        if (instance == null) {
            instance = new IdealCondition();
        }

        return instance;
    }

    protected IdealCondition() {
        
    }
    
    private static double IDEAL_WIND = Double.MAX_VALUE;
    private static int IDEAL_SWELL = Integer.MAX_VALUE;
    private static int IDEAL_RAIN = Integer.MAX_VALUE;
    
    private static String location = "";

    @Override
    public void setWindSpeed(double speed) {
       IDEAL_WIND = speed;
    }

    @Override
    public void setRainyDays(int rain) {
        IDEAL_RAIN = rain;
    }

    @Override
    public void setSwellHeight(int height) {
        IDEAL_SWELL = height;
    }

    @Override
    public double getWindSpeed() {
        return IDEAL_WIND;
    }

    @Override
    public int getRainyDays() {
        return IDEAL_RAIN;
    }

    @Override
    public int getSwellHeight() {
        return IDEAL_SWELL;
    }

    @Override
    public void setLocation(String conditionForThisArea) {
        location = conditionForThisArea;
    }

    @Override
    public String getLocation() {
        return location;
    }

    
}
