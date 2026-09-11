package com.aitu.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Pizza {

    private final PizzaSize size;
    private final DoughType dough;
    private final SauceType sauce;
    private final List<String> toppings;

    Pizza(PizzaSize size, DoughType dough, SauceType sauce, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public PizzaSize getSize() { return size; }
    public DoughType getDough() { return dough; }
    public SauceType getSauce() { return sauce; }
    public List<String> getToppings() { return toppings; }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", toppings=" + toppings +
                '}';
    }

}