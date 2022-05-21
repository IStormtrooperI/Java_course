package com.company;

public class Cat extends Animal {
    private String food;
    private static int countOfEyes = 2;

    public Cat(String name, String animalType, String food) {
        super(name,animalType);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setFood(String food1, String food2) {
        this.food = food1 + " and " + food2;
    }

    public void makeFriends(Cat cat){
        System.out.println("Im " + this.getName() + " we're friends with " + cat.getName());
    }

    public void printInfo() {
        System.out.println("Im "+ super.getAnimalType() + " " + super.getName() + " and im eating " + food);
    }
}
