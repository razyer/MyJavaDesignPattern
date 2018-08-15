package DecoratorPattern;

/**
 * Concrete Decorator
 * @author tanzhen
 * @date 2018/8/8
 */
public class Mocha implements Beverage {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Mocha";
    }

    @Override
    public double cost() {
        double cost = 0.6;
        return beverage.cost() + cost;
    }
}
