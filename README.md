Pizza Order Builder

Assignment 1 — Builder design pattern. 
Product: Pizza.

The same construction steps (size, dough, sauce, toppings) produce two representations: an immutable Pizza object and a text receipt String.

Structure:
Product: Pizz
Builder: PizzaBuilder
ConcreteBuilder: PizzaObjectBuilder, ReceiptBuilder
Director: PizzaDirector (makeMargherita, makePepperoniFeast)
Client: Main

Fluent setters return this.
Pizza is immutable: final fields, package-private constructor, no public setters.
getResult() validates required fields and throws IllegalStateException if missing.
PizzaSize, DoughType and SauceType are enums instead of magic strings.
