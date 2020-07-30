package april.pattern.creational.factory.abstractfactory;

import april.pattern.creational.factory.INote;
import april.pattern.creational.factory.IVideo;
import april.pattern.creational.factory.JavaNote;
import april.pattern.creational.factory.JavaVideo;

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
