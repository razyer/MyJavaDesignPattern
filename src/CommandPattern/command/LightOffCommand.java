package CommandPattern.command;

import CommandPattern.receiver.Light;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
