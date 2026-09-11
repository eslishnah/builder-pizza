package com.aitu.pizza;

public class PizzaDirector {

    public void makeMargherita(PizzaBuilder builder) {
        builder.setSize(PizzaSize.MEDIUM)
                .setDough(DoughType.TRADITIONAL)
                .setSauce(SauceType.TOMATO)
                .addTopping("Mozzarella")
                .addTopping("Basil");
    }

    public void makePepperoniFeast(PizzaBuilder builder) {
        builder.setSize(PizzaSize.LARGE)
                .setDough(DoughType.THICK)
                .setSauce(SauceType.TOMATO)
                .addTopping("Pepperoni")
                .addTopping("Extra cheese")
                .addTopping("Jalapenos");
    }
}