package com.compamy;

public class FactorySelector {
        public static AbstractFactory getFactory(String choice){
            AbstractFactory factory=null;
            if(choice.equalsIgnoreCase("Burger")){
                 factory = new BurgerFactory();
            } else if(choice.equalsIgnoreCase("Pizza")){
                 factory = new PizzaFactory();
            }
            return factory;
        }
}
