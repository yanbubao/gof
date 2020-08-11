package april.pattern.behavioral.iterator.course;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {

        ICourseAggregate<Course> courses = new CourseAggregateImpl<>();
        courses.add(new Course("Java"));
        courses.add(new Course("Python"));
        courses.add(new Course("MySQL"));

        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
