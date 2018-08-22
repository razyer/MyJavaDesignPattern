package templatemethod;

import templatemethod.template.CaffeineBeverage;

/**
 * @author tanzhen
 * @date 2018/8/22
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
