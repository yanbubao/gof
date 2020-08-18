package april.pattern.behavioral.observer.general;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 具体的被观察者
 *
 * @author yanzx
 */
public class ConcreteSubject<E> implements ISubject<E> {

    private List<IObserver<E>> observers = Lists.newArrayList();

    @Override
    public boolean attach(IObserver<E> observer) {
        return observers.add(observer);
    }

    @Override
    public boolean detach(IObserver<E> observer) {
        return observers.remove(observer);
    }

    @Override
    public void notify(E event) {
        this.observers.forEach(o -> {
            o.update(event);
        });
    }
}
