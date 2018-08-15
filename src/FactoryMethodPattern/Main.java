package FactoryMethodPattern;

public class Main {
    public static final String CHEESE = "cheese";
    public static final String VEGGIE = "veggie";

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        Pizza nyCheesePizza = nyPizzaStore.orderPizza(CHEESE);
        Pizza nyVeggiePizza = nyPizzaStore.orderPizza(VEGGIE);

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        Pizza cgCheesePizza = chicagoPizzaStore.orderPizza(CHEESE);
        Pizza cgVeggiePizza = chicagoPizzaStore.orderPizza(VEGGIE);
    }
}