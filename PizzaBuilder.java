package com.aitu.pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(PizzaSize size);
    PizzaBuilder setDough(DoughType dough);
    PizzaBuilder setSauce(SauceType sauce);
    PizzaBuilder addTopping(String topping);
}