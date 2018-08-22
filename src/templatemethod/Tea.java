package templatemethod;

import templatemethod.template.CaffeineBeverage;

/**
 * @author tanzhen
 * @date 2018/8/22
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
