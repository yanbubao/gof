package april.pattern.behavioral.template.course;

/**
 * @author yanzx
 */
public class PythonCourse extends AbstractCourseTemplate {
    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
