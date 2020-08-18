package april.pattern.behavioral.observer.general;

/**
 * @author yanzx
 */
public class ConcreteSubject<E> implements ISubject<E> {
    @Override
    public boolean attach(IObserver<E> observer) {
        return false;
    }

    @Override
    public boolean detach(IObserver<E> observer) {
        return false;
    }

    @Override
    public void notify(E event) {

    }
}
