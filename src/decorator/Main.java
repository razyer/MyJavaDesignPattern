package decorator;

/**
 * 装饰器模式
 * @author tanzhen
 * @date 2018/8/8
 */
public class Main {
    public static void main(String[] args) {
        HoseBlend hoseBlend = new HoseBlend();
        System.out.println(hoseBlend.getDescription() + ", Price: $" + hoseBlend.cost());
        Beverage specialHoseBlend = new Milk(hoseBlend);
        System.out.println(specialHoseBlend.getDescription() + ", Price: $" + specialHoseBlend.cost());

        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + ", Price: $" + darkRoast.cost());
        Beverage specialDarkRoast = new Mocha(new Milk(darkRoast));
        System.out.println(specialDarkRoast.getDescription() + ", Price: $" + specialDarkRoast.cost());

    }
}
