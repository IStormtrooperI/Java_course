package com.company;

public class Main {

    public static void main(String[] args) {
        FifaManager manager = new FifaManager();
        RealMadridFan fan1 = new RealMadridFan();
        BarcelonaFan fan2 = new BarcelonaFan();
        manager.subscribeToFifa(fan1);
        manager.subscribeToFifa(fan2);
        manager.addGame();
    }
}
