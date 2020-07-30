package april.pattern.creational.factory.factorymethod;

import april.pattern.creational.factory.ICourse;
import april.pattern.creational.factory.JavaCourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:45
 */
public class JavaFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
