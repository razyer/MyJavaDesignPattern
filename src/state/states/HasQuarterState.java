package state.states;

import state.context.GumballMachine;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author tanzhen
 * @date 2018/8/23
 */
public class HasQuarterState implements State {
    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't inserted another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        boolean isWinner = ThreadLocalRandom.current().nextInt(10) == 0;
        if (isWinner && machine.getCount() > 1) {
            System.out.println("You are a Winner!");
            machine.setState(machine.getWinnerState());
        } else {
            machine.setState(machine.getSoldState());
        }

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
