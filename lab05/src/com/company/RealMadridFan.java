package com.company;

import com.company.Game;
import com.company.Observer;

import java.util.Locale;


public class RealMadridFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if(data.plan.toLowerCase().contains("realmadrid")){
            System.out.println("I'm a RealMadrid fan");
            System.out.println("RealMadrid is here so go to match");
            System.out.println("_________________");
        }
    }
}
