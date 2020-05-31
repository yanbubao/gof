package april.pattern.factory.factorymethod;

import april.pattern.factory.ICourse;
import april.pattern.factory.PythonCourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:47
 */
public class PythonFactory implements ICourseFactory {
    public ICourse create() {
        return new PythonCourse();
    }
}
