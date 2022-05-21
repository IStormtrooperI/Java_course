package com.company;

public class Animal {
    private final String name;
    private final String animalType;

    public Animal(String name, String animalType){
        this.name = name;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }
}
