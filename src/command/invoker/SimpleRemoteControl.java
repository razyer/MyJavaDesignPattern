package command.invoker;

import command.command.Command;
import command.command.NoCommand;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public class SimpleRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command preCommand;
    private int slots;

    public SimpleRemoteControl(int slots) {
        this.slots = slots;
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        preCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot >= this.slots) {
            throw new IllegalArgumentException("IllegalArgument slot input");
        }
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        preCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        preCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        if (preCommand != null) {
            preCommand.undo();
        }
    }
}
