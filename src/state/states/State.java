package state.states;

/**
 * @author tanzhen
 * @date 2018/8/23
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
