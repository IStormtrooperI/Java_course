package com.company;

import com.company.Game;
import com.company.Observer;

public class BarcelonaFan implements Observer<Game> {
    @Override
    public void update(Game data) {
        if (data.plan.toLowerCase().contains("barcelona")) {
            System.out.println("I'm a Barcelona fan");
            System.out.println("Barcelona is here so go to match");
            System.out.println("_________________");
        }
    }
}
