package state.context;

import state.states.*;

/**
 * @author tanzhen
 * @date 2018/8/23
 */
public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int count) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if (count < 0) {
            throw new IllegalArgumentException("count can't be negative");
        } else if (count == 0) {
            state = soldOutState;
        } else {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseGumball() {
        System.out.println("A gumball comes rolling out the slot");
        if (count > 0) {
            count--;
        }
    }

    public void refill(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Refill count can't be zero or negative");
        } else {
            this.count += count;
            System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
            state = noQuarterState;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }


    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is ").append(state).append("\n");
        return result.toString();
    }
}
