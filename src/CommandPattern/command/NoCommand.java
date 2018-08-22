package CommandPattern.command;

/**
 * @author tanzhen
 * @date 2018/8/22
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command to execute");
    }

    @Override
    public void undo() {
        System.out.println("No command is undo");
    }
}
