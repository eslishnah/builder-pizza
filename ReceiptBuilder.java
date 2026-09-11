package com.aitu.pizza;

import java.util.ArrayList;
import java.util.List;

public class ReceiptBuilder implements PizzaBuilder {

    private static final String HEADER = "=== Pizza Receipt ===\n";
    private static final String SIZE_LABEL = "Size: ";
    private static final String DOUGH_LABEL = "Dough: ";
    private static final String SAUCE_LABEL = "Sauce: ";
    private static final String TOPPINGS_HEADER = "Toppings:\n";
    private static final String TOPPING_BULLET = "- ";

    private PizzaSize size;
    private DoughType dough;
    private SauceType sauce;
    private final List<String> toppings = new ArrayList<>();

    @Override
    public ReceiptBuilder setSize(PizzaSize size) {
        this.size = size;
        return this;
    }

    @Override
    public ReceiptBuilder setDough(DoughType dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public ReceiptBuilder setSauce(SauceType sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public ReceiptBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public String getResult() {
        if (size == null) {
            throw new IllegalStateException("Pizza size is required");
        }
        if (dough == null) {
            throw new IllegalStateException("Dough type is required");
        }

        StringBuilder receipt = new StringBuilder(HEADER);
        receipt.append(SIZE_LABEL).append(size).append('\n');
        receipt.append(DOUGH_LABEL).append(dough).append('\n');
        if (sauce != null) {
            receipt.append(SAUCE_LABEL).append(sauce).append('\n');
        }
        if (!toppings.isEmpty()) {
            receipt.append(TOPPINGS_HEADER);
            for (String topping : toppings) {
                receipt.append(TOPPING_BULLET).append(topping).append('\n');
            }
        }
        return receipt.toString();
    }
}