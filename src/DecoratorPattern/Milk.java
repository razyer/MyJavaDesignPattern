package DecoratorPattern;

/**
 * Concrete Decorator
 * @author tanzhen
 * @description
 * @date 2018/8/8
 */
public class Milk implements Beverage {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Milk";
    }

    @Override
    public double cost() {
        double cost = 0.5;
        return beverage.cost() + cost;
    }
}
