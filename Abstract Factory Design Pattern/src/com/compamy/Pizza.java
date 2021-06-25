package com.compamy;

public class Pizza {
    public String name;
    Pizza(){
        this.name = "Burger";
    }
    public String getName(){
        return this.name;
    }

    public void prepare(String name){
        System.out.println(name+" Burger is being prepared");
    }
    public void addExtraCheese(String name){
        System.out.println("Extra cheese has been added to "+ name );
    }
    public void addToppings(String name){
        System.out.println("Extra toppings has been added to "+name);
    }
}
