package com.company;

public class Son extends Person implements Study{
    public Son(String name) {
        this.name = name;
        this.money = 0;
    }

    public void setAllowances(double cost){
        this.money += cost;
    }

    protected void introduce(){
        System.out.println("Hello Im " + this.name + " and Im son");
    }

    public void study(){
        System.out.println("Im " + this.name + " and Im studying");
    }

    public void buyBooks(double cost){
        this.money -= cost;
        System.out.println("Im " + this.name + " Im bought book for " + cost);
    }

    public void report(){
        System.out.println(this.name + " " + this.money);
    }
}
