package CommandPattern.command;

/**
 * @author tanzhen
 * @date 2018/8/21
 */
public interface Command {
    void execute();
    void undo();
}
