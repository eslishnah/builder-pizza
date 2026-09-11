package com.aitu.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaObjectBuilder implements PizzaBuilder {

    private PizzaSize size;
    private DoughType dough;
    private SauceType sauce;
    private final List<String> toppings = new ArrayList<>();

    @Override
    public PizzaObjectBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaObjectBuilder setDough(DoughType dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaObjectBuilder setSauce(SauceType sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaObjectBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza getResult() {
        if (size == null) {
            throw new IllegalStateException("Pizza size is required");
        }
        if (dough == null) {
            throw new IllegalStateException("Dough type is required");
        }
        return new Pizza(size, dough, sauce, toppings);
    }
}