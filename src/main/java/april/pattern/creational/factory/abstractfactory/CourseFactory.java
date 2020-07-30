package april.pattern.creational.factory.abstractfactory;

import april.pattern.creational.factory.INote;
import april.pattern.creational.factory.IVideo;

/**
 * @author yanzx
 * @date 2020/05/31 23:08
 */
public abstract class CourseFactory {

    abstract INote createNote();

    abstract IVideo createVideo();
}
