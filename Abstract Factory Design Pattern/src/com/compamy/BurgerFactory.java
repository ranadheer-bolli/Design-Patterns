package com.compamy;

public class BurgerFactory implements AbstractFactory{
    public Burger create(String type){
        Burger burger = null;
        if(type == "Veg") burger = new VegBurger();
        else if(type == "Chicken") burger = new ChickenBurger();
        return burger;
    }


}
