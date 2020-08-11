package april.pattern.behavioral.iterator.general;

import java.util.List;

/**
 * @author yanzx
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private final List<E> list;

    /**
     * 游标
     */
    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return this.list.get(this.cursor++);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < list.size();
    }
}
