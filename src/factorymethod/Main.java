package factorymethod;

public class Main {
    public static final String CHEESE = "cheese";
    public static final String VEGGIE = "veggie";

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        nyPizzaStore.orderPizza(CHEESE);
        nyPizzaStore.orderPizza(VEGGIE);

        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
        chicagoPizzaStore.orderPizza(CHEESE);
        chicagoPizzaStore.orderPizza(VEGGIE);
    }
}