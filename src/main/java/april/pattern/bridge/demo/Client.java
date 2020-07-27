package april.pattern.bridge.demo;

import april.pattern.bridge.demo.impl.JavaNote;
import april.pattern.bridge.demo.impl.PythonNote;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AbstractCourse pythonCourse = new PythonCourse();
        pythonCourse.setNote(new PythonNote());
        System.out.println(pythonCourse);

        AbstractCourse javaCourse = new JavaCourse();
        javaCourse.setNote(new JavaNote());
        System.out.println(javaCourse);
    }
}
