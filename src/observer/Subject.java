package observer;

/**
 * @author tanzhen
 * @description
 * @date 2018/8/2
 */
public interface Subject {
    void registerListener(Listener listener);

    void removeListener(Listener listener);

    void notifyListeners();
}
