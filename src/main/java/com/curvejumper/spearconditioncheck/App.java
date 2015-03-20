/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.spearconditioncheck;

import com.curvejumper.weather.SpearfishingWeather;
import org.springframework.boot.SpringApplication;

/**
 *
 * @author michael
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        SpearfishingWeather test = new SpearfishingWeather();
        
        
        System.out.println(test.Wind());
        // Run Spring Boot
//        ConditionCheck.refreshConditions();
//        SpringApplication.run(App.class, args);
    }
}
