package com.company;

public class Eagle {
    String name;
    String eagleType;

    public Eagle(String eagleName, String eagleType){
        this.name = eagleName;
        this.eagleType = eagleType;
    }

    public void makeSound() {
        System.out.println(this.name + " make sound -> ыыыыы");
    }

    public void hunt() {
        System.out.println(this.name + " said: Im hunting");
    }
}
