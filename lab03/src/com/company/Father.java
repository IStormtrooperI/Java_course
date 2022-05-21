package com.company;

public class Father extends Person implements Provide {
    private double salary;
    public Father(String name) {
        this.name = name;
        this.money = 0;
        this.salary = 10000;
    }

    public double getSalary() {
        this.money += salary;
        return this.money;
    }

    protected void introduce() {
        System.out.println("Hello Im " + this.name + " and Im father");
    }

    public void payBills(double cost) {
        this.money -= cost;
        System.out.println("Im pay bills " + cost);
    }

    public void giveAllowances(double cost, Son son) {
        this.money -= cost;
        son.setAllowances(cost);
        System.out.println("Im give allowances to " + son);
    }

    protected void report() {
        System.out.println(this.name + " " + this.money + " " + this.salary);
    }
}
