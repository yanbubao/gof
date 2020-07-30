package april.pattern.creational.factory.factorymethod;

import april.pattern.creational.factory.ICourse;
import april.pattern.creational.factory.PythonCourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:47
 */
public class PythonFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
