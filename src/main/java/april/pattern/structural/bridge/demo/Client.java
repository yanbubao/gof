package april.pattern.structural.bridge.demo;

import april.pattern.structural.bridge.demo.impl.JavaNote;
import april.pattern.structural.bridge.demo.impl.PythonNote;

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
