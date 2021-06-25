package com.compamy;

public class DoubleCheese extends Burger {
    public String name;
    DoubleCheese(){
        this.name = "Double Cheese Burger";
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("Double cheese Burger");
    }
}
