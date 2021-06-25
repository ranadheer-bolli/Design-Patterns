package com.compamy;

public class AmericanKFC extends KFC{
        public Burger createBurger(String type) {
            Burger burger = null;
            if(type == "Veg") burger = new VegBurger();
            else if(type == "Chicken") burger = new ChickenBurger();
            else if(type == "Beef") burger = new BeefBurger();
            return burger;
        }
}
