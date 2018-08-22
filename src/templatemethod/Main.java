package templatemethod;

import templatemethod.template.CaffeineBeverage;

/**
 * 模板方法模式
 *
 * @author tanzhen
 * @date 2018/8/22
 */
public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        coffee.prepareRecipe();
        System.out.println("===========");
        tea.prepareRecipe();
    }
}
