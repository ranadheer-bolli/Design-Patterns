package com.compamy;

public class PizzaFactory implements AbstractFactory{

    public Pizza create(String type){
        Pizza pizza = null;
        if(type == "Veg") pizza = new VegPizza();
        else if(type == "Chicken") pizza = new ChickenPizza();
        return pizza;
    }

}
