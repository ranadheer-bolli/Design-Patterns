package com.compamy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String type,choice1,choice2;
        Scanner sc = new Scanner(System.in);
        choice1 = "Burger";
        choice2 = "Pizza";
        // choice = sc.next();
        AbstractFactory<Burger> factory1 = FactorySelector.getFactory(choice1);
        AbstractFactory<Pizza> factory2 = FactorySelector.getFactory(choice2);
        type = "Chicken";
        //type = sc.next();
        System.out.println(factory1.create(type).getName());
        System.out.println(factory2.create(type).getName());
    }
}
