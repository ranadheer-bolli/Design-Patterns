package com.compamy;

public abstract class KFC {
    public String burgername;
    public void orderBurger(String type){
        Burger burger=createBurger(type);
        burgername = burger.getName();
        burger.prepare(burgername);
        burger.addExtraCheese(burgername);
        burger.extraFries(burgername);
    }
    public abstract Burger createBurger(String type);
}
