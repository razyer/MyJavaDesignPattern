package DecoratorPattern;

/**
 *
 * @author tanzhen
 * @date 2018/8/8
 */
public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return 11.5;
    }
}
