package com.company;

public class Main {
    public static void main(String[] args) {
        Eagle firstEagle = new Eagle("firstEagle", "firstTypeOfEagle");
        Eagle secondEagle = new Eagle("secondEagle", "secondTypeOfEagle");
        Eagle thirdEagle = new Eagle("thirdEagle", "firstTypeOfEagle");

        System.out.println(firstEagle.name);
        System.out.println(firstEagle.eagleType);
        firstEagle.makeSound();
        firstEagle.hunt();
        System.out.println("________");
        System.out.println(secondEagle.name);
        System.out.println(secondEagle.eagleType);
        secondEagle.makeSound();
        secondEagle.hunt();
        System.out.println("________");
        System.out.println(thirdEagle.name);
        System.out.println(thirdEagle.eagleType);
        thirdEagle.makeSound();
        thirdEagle.hunt();

    }
}
