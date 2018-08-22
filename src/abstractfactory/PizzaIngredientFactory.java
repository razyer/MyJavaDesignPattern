package abstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();
}
