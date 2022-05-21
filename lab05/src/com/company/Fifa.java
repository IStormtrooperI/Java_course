package com.company;

import com.company.Game;
import com.company.Observer;

import java.util.ArrayList;
import java.util.List;

public class Fifa {

    List<Observer<Game>> observerList;

    public Fifa() {
        this.observerList = new ArrayList<>();
    }

    public void subscribe(Observer<Game> observer){
        observerList.add(observer);
    }

    public void notify(Game game){
        observerList.forEach(observer -> observer.update(game));
    }
}
