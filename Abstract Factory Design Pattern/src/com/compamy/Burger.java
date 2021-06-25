package com.compamy;

public class Burger {
    public String name;

    Burger() {
        this.name = "Burger";
    }

    public String getName() {
        return this.name;
    }

    public void prepare(String name) {
        System.out.println(name + " Burger is being prepared");
    }

    public void addExtraCheese(String name) {
        System.out.println("Extra cheese has been added to " + name);
    }

    public void extraFries(String name) {
        System.out.println("Extra Fries has been added to " + name);
    }

}
