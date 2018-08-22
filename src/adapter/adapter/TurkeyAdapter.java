package adapter.adapter;

import adapter.adaptee.Turkey;
import adapter.target.Duck;

/**
 * @author tanzhen
 * @description
 * @date 2018/8/2
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
