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
public class SpearConditionManager implements ConditionManager {
    private static IdealCondition idealCondition;
    private static CurrentCondition currentCondition;
    private int conditionRanking;
    
    public SpearConditionManager(IdealCondition ideal, CurrentCondition current, int ranking) {
        idealCondition = ideal;
        currentCondition = current;
        conditionRanking = ranking;
    }
    
    //dummy constructor
    public SpearConditionManager(){
        
    }

    @Override
    public void setIdealCondition(Condition condition) {
        idealCondition = (IdealCondition) condition;
    }

    @Override
    public void setCurrentCondition(Condition condition) {
        currentCondition = (CurrentCondition) condition;
    }

    @Override
    public void setRanking(int ranking) {
        conditionRanking = ranking;
    }

    @Override
    public Condition getIdealCondition() {
        return idealCondition;
    }

    @Override
    public Condition getCurrentCondition() {
        return currentCondition;
    }

    @Override
    public int getConditionRanking() {
        return conditionRanking;
    }
    
    
}
