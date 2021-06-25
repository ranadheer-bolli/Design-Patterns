package com.compamy;

public class BurgerFactory {
    public Burger createBurger(String type){
        Burger burger = null;
        if(type == "Veg") burger = new VegBurger();
        else if(type == "Chicken") burger = new ChickenBurger();
        return burger;
    }
}
