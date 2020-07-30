package april.pattern.creational.factory.factorymethod;

import april.pattern.creational.factory.ICourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:47
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory = new PythonFactory();

        ICourse course = factory.create();

        course.record();

    }
}
