package ObserverPattern;

/**
 * Concrete Observer
 * @author tanzhen
 * @date 2018/8/2
 */
public class Dashboard1 implements Listener {
    private Subject subject;

    public Dashboard1(Subject subject) {
        this.subject = subject;
        subject.registerListener(this);
    }

    @Override
    public void update() {
        System.out.println("Dashboard1 is updating");
    }
}
