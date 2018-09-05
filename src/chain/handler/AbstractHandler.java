package chain.handler;


/**
 * @author tanzhen
 * @date 2018/9/5
 */
public abstract class AbstractHandler implements Handler {
    protected AbstractHandler next;

    public AbstractHandler(AbstractHandler next) {
        this.next = next;
    }
}
