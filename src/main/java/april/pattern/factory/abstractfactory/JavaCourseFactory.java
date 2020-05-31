package april.pattern.factory.abstractfactory;

import april.pattern.factory.INote;
import april.pattern.factory.IVideo;
import april.pattern.factory.JavaNote;
import april.pattern.factory.JavaVideo;

/**
 * @author yanzx
 * @date 2020/05/31 23:10
 */
public class JavaCourseFactory extends CourseFactory {

    @Override
    INote createNote() {
        return new JavaNote();
    }

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }
}
