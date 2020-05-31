package april.pattern.factory.simplefactory;

import april.pattern.factory.ICourse;
import april.pattern.factory.JavaCourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:23
 */
public class SimpleCourseTest {

    public static void main(String[] args) throws Exception {
        CourseFactory factory = new CourseFactory();

        ICourse course = factory.create(JavaCourse.class);

        if (course != null) {
            course.record();
        } else {
            throw new Exception("not found course class!");
        }
    }
}
