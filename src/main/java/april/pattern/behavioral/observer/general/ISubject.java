package april.pattern.behavioral.observer.general;

/**
 * 被观察的对象Observable
 *
 * @author yanzx
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
