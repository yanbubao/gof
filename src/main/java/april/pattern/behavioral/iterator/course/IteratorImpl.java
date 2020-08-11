package april.pattern.behavioral.iterator.course;

import java.util.List;

/**
 * @author yanzx
 */
public class IteratorImpl<E> implements Iterator<E> {

    private final List<E> list;

    private int cursor;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置 " + cursor + " : ");
        element = this.list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.list.size();
    }
}
