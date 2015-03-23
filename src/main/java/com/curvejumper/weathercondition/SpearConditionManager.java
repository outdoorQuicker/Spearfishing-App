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
    private static IdealCondition idealCondition = new IdealCondition();
    private static CurrentCondition currentCondition = new CurrentCondition();
    private int conditionRanking;
    
    private static SpearConditionManager instance = null;

    public static SpearConditionManager getInstance() {
        if (instance == null) {
            instance = new SpearConditionManager();
        }

        return instance;
    }

    protected SpearConditionManager() {
        
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
