package com.compamy;

public class ChickenPizza extends Pizza {
    public String name;
    ChickenPizza(){
        this.name = "Chicken Pizza";
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.println("Chicken Pizza");
    }
}
