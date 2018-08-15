package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        PizzaIngredientFactory nyFactory = new NYPizzaIngredientFactory();
        PizzaIngredientFactory cgFactory = new ChicagoPizzaIngredientFactory();

        nyFactory.createDough();
        nyFactory.createSauce();
        cgFactory.createDough();
        cgFactory.createSauce();
    }
}
