package state;

import state.context.GumballMachine;

/**
 * 状态模式
 *
 * @author tanzhen
 * @date 2018/8/23
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(4);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println("=======================");
        machine.insertQuarter();
        machine.turnCrank();
        System.out.println("=======================");
        machine.insertQuarter();
        machine.turnCrank();
    }
}
