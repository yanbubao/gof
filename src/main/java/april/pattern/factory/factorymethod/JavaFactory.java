package april.pattern.factory.factorymethod;

import april.pattern.factory.ICourse;
import april.pattern.factory.JavaCourse;

/**
 * @author yanzx
 * @date 2020/05/31 22:45
 */
public class JavaFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
