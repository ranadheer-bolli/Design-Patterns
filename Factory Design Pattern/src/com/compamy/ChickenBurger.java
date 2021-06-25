package com.compamy;

public class ChickenBurger extends Burger{
   public String name;
    ChickenBurger(){
    this.name = "Chicken Burger";
   }
   public String getName(){
        return this.name;
   }

    public void display(){
        System.out.println("ChickenBurger");
    }
}
