package april.pattern.behavioral.observer.general;

/**
 * 具体观察者
 *
 * @author yanzx
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(E event) {
        System.out.println("receive event: " + event);
    }
}
