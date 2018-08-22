package CommandPattern.command;

import CommandPattern.receiver.TV;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
