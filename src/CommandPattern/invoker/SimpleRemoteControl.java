package CommandPattern.invoker;

import CommandPattern.command.Command;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public class SimpleRemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command preCommand;
    private int slots;

    public SimpleRemoteControl(int slots) {
        this.slots = slots;
        onCommand = new Command[slots];
        offCommand = new Command[slots];
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot < 0 || slot >= this.slots) {
            throw new IllegalArgumentException("IllegalArgument slot input");
        }
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        if (onCommand[slot] == null) {
            System.out.println("Slot " + slot + " is uncommanded");
            return;
        }
        onCommand[slot].execute();
        preCommand = onCommand[slot];
    }

    public void offButtonWasPressed(int slot) {
        if (offCommand[slot] == null) {
            System.out.println("Slot " + slot + " is uncommanded");
            return;
        }
        offCommand[slot].execute();
        preCommand = offCommand[slot];
    }

    public void undo() {
        if (preCommand != null) {
            preCommand.undo();
        }
    }
}
