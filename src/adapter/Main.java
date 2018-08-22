package adapter;

import adapter.adaptee.Turkey;
import adapter.adaptee.WildTurkey;
import adapter.adapter.TurkeyAdapter;
import adapter.target.Duck;
import adapter.target.MallardDuck;

/**
 * 适配器模式
 * @author tanzhen
 * @date 2018/8/2
 */
public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.quack();
        duck.fly();
        Turkey turkey = new WildTurkey();
        //turkey dress up as a duck using the adapter
        Duck strangeDuck = new TurkeyAdapter(turkey);
        strangeDuck.quack();
        strangeDuck.fly();
    }
}
