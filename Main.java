package com.aitu.pizza;

public class Main {

    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        System.out.println("=== Margherita ===");

        PizzaObjectBuilder objectBuilder = new PizzaObjectBuilder();
        director.makeMargherita(objectBuilder);
        Pizza pizza = objectBuilder.getResult();
        System.out.println("Object: " + pizza);

        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        director.makeMargherita(receiptBuilder);
        String receipt = receiptBuilder.getResult();
        System.out.println("Receipt:\n" + receipt);

        System.out.println("\n=== Validation === ");
        try {
            new PizzaObjectBuilder()
                    .setDough(DoughType.THIN)
                    .getResult();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
