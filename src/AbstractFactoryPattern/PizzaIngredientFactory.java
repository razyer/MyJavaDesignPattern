package AbstractFactoryPattern;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();
}
