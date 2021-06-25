package com.compamy;

public class VegBurger extends Burger{
    public String name;
    VegBurger(){
        this.name = "Veg Burger";
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("VegBurger");
    }
}
