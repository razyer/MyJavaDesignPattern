package state.states;

import state.context.GumballMachine;

/**
 * @author tanzhen
 * @date 2018/8/23
 */
public class WinnerState implements State {
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        machine.releaseGumball();
        if (machine.getCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            machine.setState(machine.getSoldOutState());
        } else {
            machine.releaseGumball();
            if (machine.getCount() == 0) {
                System.out.println("Oops, out of gumballs!");
                machine.setState(machine.getSoldOutState());
            } else {
                machine.setState(machine.getNoQuarterState());
            }
        }

    }
}
