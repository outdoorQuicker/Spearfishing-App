package com.curvejumper.weathercondition;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 *
 * @author curvejumper
 */
//@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
//@JsonSubTypes({  
//    @Type(value = SpearConditionManager.class, name = "")
//    }) 
public interface ConditionManager {
    public void setIdealCondition(Condition condition);
    
    public void setCurrentCondition(Condition condition);
    
    public void setRanking(int ranking);
    
    public Condition getIdealCondition();
    
    public Condition getCurrentCondition();
    
    public int getConditionRanking();
}
