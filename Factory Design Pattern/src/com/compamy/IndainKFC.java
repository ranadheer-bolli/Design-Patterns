package com.compamy;

public class IndainKFC extends KFC{
    @Override
    public Burger createBurger(String type) {
        Burger burger = null;
        if(type == "Veg") burger = new VegBurger();
        else if(type == "Chicken") burger = new ChickenBurger();
        else if(type == "DoubleCheese") burger = new DoubleCheese();
        return burger;
    }
}
