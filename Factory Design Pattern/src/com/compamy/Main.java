package com.compamy;

public class Main {

    public static void main(String[] args) {
        KFC kfc = new AmericanKFC();
        kfc.orderBurger("Beef");
        KFC kfc1 = new IndainKFC();
        kfc1.orderBurger("DoubleCheese");
    }
}
