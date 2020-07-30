package april.pattern.behavioral.template.course;

/**
 * @author yanzx
 */
public class JavaCourse extends AbstractCourseTemplate {

    private boolean needCheckHomework = false;

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }

    public void setNeedCheckHomework(boolean needCheckHomework) {
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheckHomework;
    }
}
