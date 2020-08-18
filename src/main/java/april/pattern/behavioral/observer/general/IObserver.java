package april.pattern.behavioral.observer.general;

/**
 * 抽象观察者
 *
 * @author yanzx
 */
public interface IObserver<E> {
    void update(E event);
}