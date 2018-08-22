package CommandPattern.command;

import CommandPattern.receiver.TV;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
