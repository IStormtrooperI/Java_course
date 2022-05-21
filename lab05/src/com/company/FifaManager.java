package com.company;

import com.company.Fifa;
import com.company.Game;
import com.company.Observer;

import java.util.Scanner;

public class FifaManager {
    private final Scanner scanner;
    private final Fifa fifa;

    public FifaManager() {
        this.fifa = new Fifa();
        this.scanner = new Scanner(System.in);
    }

    public void addGame(){
        System.out.println("Enter game plan");
        String plan = scanner.nextLine();
        Game game = new Game();
        game.plan = plan;
        fifa.notify(game);
    }

    public void subscribeToFifa(Observer<Game> fan){
        fifa.subscribe(fan);
    }
}
