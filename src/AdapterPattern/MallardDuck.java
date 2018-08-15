package AdapterPattern;

/**
 * @author tanzhen
 * @description
 * @date 2018/8/2
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
