package april.pattern.behavioral.observer.general;

/**
 * @author yanzx
 */
public interface IObserver<E> {
    void update(E event);
}
