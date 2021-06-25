package com.compamy;

public class BeefBurger extends Burger {
    public String name;
    BeefBurger(){
        this.name = "Beef Burger";
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("BeefBurger");
    }
}
