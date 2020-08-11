package april.pattern.behavioral.iterator.general;

/**
 * 聚合接口，如List
 * @author yanzx
 */
public interface IAggregate<E> {
    boolean add(E element);
    boolean remove(E element);
    Iterator<E> iterator();
}
