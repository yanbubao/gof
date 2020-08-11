package april.pattern.behavioral.iterator.course;

/**
 * @author yanzx
 */
public interface ICourseAggregate<E> {
    void add(E element);
    void remove(E element);
    Iterator<E> iterator();
}
