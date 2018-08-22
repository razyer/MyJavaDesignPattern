package decorator;

/**
 *
 * @author tanzhen
 * @date 2018/8/8
 */
public class HoseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "HoseBlend";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
