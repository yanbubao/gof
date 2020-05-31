package april.pattern.factory.abstractfactory;

import april.pattern.factory.INote;
import april.pattern.factory.IVideo;

/**
 * @author yanzx
 * @date 2020/05/31 23:08
 */
public abstract class CourseFactory {

    abstract INote createNote();

    abstract IVideo createVideo();
}
