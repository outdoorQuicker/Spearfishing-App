package com.curvejumper.weathercondition;

/**
 *
 * @author curvejumper
 */
public interface ConditionManager {
    public void setIdealCondition(Condition condition);
    
    public void setCurrentCondition(Condition condition);
    
    public void setRanking(int ranking);
    
    public Condition getIdealCondition();
    
    public Condition getCurrentCondition();
    
    public int getConditionRanking();
}
