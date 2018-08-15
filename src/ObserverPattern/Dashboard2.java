package ObserverPattern;

/**
 * Concrete Observer
 * @author tanzhen
 * @date 2018/8/2
 */
public class Dashboard2 implements Listener {
    private Subject subject;

    public Dashboard2(Subject subject) {
        this.subject = subject;
        subject.registerListener(this);
    }

    @Override
    public void update() {
        System.out.println("Dashboard2 is updating");
    }


}
