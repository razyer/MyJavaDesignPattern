package CommandPattern;

import CommandPattern.command.LightOffCommand;
import CommandPattern.command.LightOnCommand;
import CommandPattern.command.TVOffCommand;
import CommandPattern.command.TVOnCommand;
import CommandPattern.invoker.SimpleRemoteControl;
import CommandPattern.receiver.Light;
import CommandPattern.receiver.TV;

/**
 * 命令模式
 * @author tanzhen
 * @date 2018/8/21
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl rc = new SimpleRemoteControl(7);
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        rc.setCommand(0,tvOnCommand,tvOffCommand);
        rc.setCommand(1,lightOnCommand,lightOffCommand);

        rc.onButtonWasPressed(0);
        rc.offButtonWasPressed(0);
        System.out.println("===============");
        rc.onButtonWasPressed(1);
        rc.offButtonWasPressed(1);
        System.out.println("===============");
        rc.undoButtonWasPressed();
        rc.onButtonWasPressed(5);
    }
}
