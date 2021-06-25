package com.compamy;

public class VegPizza extends Pizza {
    public String name;
    VegPizza(){
        this.name = "Veg Pizza";
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("Veg Pizza");
    }
}
