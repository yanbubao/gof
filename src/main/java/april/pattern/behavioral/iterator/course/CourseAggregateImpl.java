package april.pattern.behavioral.iterator.course;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author yanzx
 */
public class CourseAggregateImpl<E> implements ICourseAggregate<E> {

    private final List<E> courseList;

    public CourseAggregateImpl() {
        this.courseList = Lists.newArrayList();
    }

    @Override
    public void add(E element) {
        this.courseList.add(element);
    }

    @Override
    public void remove(E element) {
        this.courseList.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl<>(courseList);
    }
}
